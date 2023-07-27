package com.healthcare.claims.service;

import com.healthcare.claims.dao.MemberDao;
import com.healthcare.claims.model.ClaimOutputProcessResponse;
import com.healthcare.claims.model.ClaimProcessInputRequest;
import com.healthcare.claims.model.MemberDetails;
import com.healthcare.claims.processor.ClaimSettlementProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
public class ClaimService {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberNetworkService memberNetworkService;
    @Autowired
    ClaimSettlementProcessor claimSettlementProcessor;

    @Autowired
    MemberDao memberDao;

    public ClaimOutputProcessResponse processClaim(ClaimProcessInputRequest claimProcessInputRequest){
        MemberDetails memberDetails = memberDao.getMemberByMemberId(claimProcessInputRequest.getMemberId());
        ClaimOutputProcessResponse claimOutputProcessResponse= new ClaimOutputProcessResponse();
        String memberValidations = memberService.validateMemeberEligibility(claimProcessInputRequest,memberDetails);
        if(Objects.nonNull(memberValidations)){
            claimOutputProcessResponse.setErrorText(memberValidations);
            return claimOutputProcessResponse;
        }
        boolean inNetwork = memberNetworkService.isInNetwork(claimProcessInputRequest);
        claimSettlementProcessor.settleClaim(claimProcessInputRequest,inNetwork,memberDetails);
        claimOutputProcessResponse.setClaimId(UUID.randomUUID().toString());
        return claimOutputProcessResponse;
    }
}

package com.healthcare.claims.service;

import com.healthcare.claims.dao.MemberDao;
import com.healthcare.claims.model.ClaimProcessInputRequest;
import com.healthcare.claims.model.MemberDetails;
import com.healthcare.claims.utils.ApplicationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberEligibilityService memberEligibilityService;

    public String validateMemeberEligibility(ClaimProcessInputRequest claimProcessInputRequest, MemberDetails memberDetails) {

        boolean isValidMember = ApplicationUtils.isValidMember(claimProcessInputRequest.getClaimSubmissionDate(), memberDetails);
        boolean isMemberEligible = false;
        boolean isInNetwork = false;
        if(!isValidMember){
            return claimProcessInputRequest.getMemberId()+" is not a valid member";
        }
        isMemberEligible = memberEligibilityService.isMemberEligible(claimProcessInputRequest);
        if(!isMemberEligible){
            return claimProcessInputRequest.getMemberId()+" is not a eligible member for the claim";
        }
        return null;
    }
}

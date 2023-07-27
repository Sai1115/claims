package com.healthcare.claims.processor;

import com.healthcare.claims.dao.MemberEligibilityDao;
import com.healthcare.claims.model.ClaimProcessInputRequest;
import com.healthcare.claims.model.MemberDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimSettlementProcessor {
    @Autowired
    MemberEligibilityDao memberEligibilityDao;
    public void settleClaim(ClaimProcessInputRequest claimProcessInputRequest, boolean inNetwork, MemberDetails memberDetails){
        int amountCanBeSettled=0;
        if(inNetwork){
            amountCanBeSettled=(90*claimProcessInputRequest.getClaimAmount())/100;
            memberEligibilityDao.updateProcessedAmount(amountCanBeSettled);
        }else{
            amountCanBeSettled=(70*claimProcessInputRequest.getClaimAmount())/100;
            memberEligibilityDao.updateProcessedAmount(amountCanBeSettled);
        }
    }
}

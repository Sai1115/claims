package com.healthcare.claims.service;

import com.healthcare.claims.dao.MemberEligibilityDao;
import com.healthcare.claims.model.ClaimProcessInputRequest;
import com.healthcare.claims.model.MemberEligibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberEligibilityService {
    @Autowired
    MemberEligibilityDao memberEligibilityDao;
    public boolean isMemberEligible(ClaimProcessInputRequest claimProcessInputRequest) {
        MemberEligibility memberEligibilityDetails = memberEligibilityDao.getMemberEligibilityDetails(claimProcessInputRequest.getMemberId());
        return (memberEligibilityDetails.getAppliedDiagnosisType().contains(claimProcessInputRequest.getDiagnosisType())
        && memberEligibilityDetails.getAppliedProcedures().contains(claimProcessInputRequest.getProcedureCode())
        && memberEligibilityDetails.getBalanceAmount()>=claimProcessInputRequest.getClaimAmount());
    }
}

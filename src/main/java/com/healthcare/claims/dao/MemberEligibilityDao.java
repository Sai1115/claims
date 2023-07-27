package com.healthcare.claims.dao;

import com.healthcare.claims.model.MemberEligibility;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class MemberEligibilityDao {
    static MemberEligibility memberEligibility= new MemberEligibility();
    public MemberEligibility getMemberEligibilityDetails(String memberId){
        memberEligibility.setMemberId(memberId);
        memberEligibility.getAppliedDiagnosisType().add("Medical");
        memberEligibility.getAppliedDiagnosisType().add("Behavioural");
        memberEligibility.getAppliedProcedures().add("P100");
        memberEligibility.getAppliedProcedures().add("P200");
        memberEligibility.getAppliedProcedures().add("P300");
        memberEligibility.setTotalAmountEligible(1000);
        memberEligibility.setAmountClaimed(500);
        return memberEligibility;
    }

    public void updateProcessedAmount(int amount){
        memberEligibility.setAmountClaimed(memberEligibility.getAmountClaimed()+amount);
    }
}

package com.healthcare.claims.model;

import java.util.ArrayList;
import java.util.List;

public class MemberEligibility {
    private String memberId;
    private List<String> appliedDiagnosisType= new ArrayList<>();
    private List<String> appliedProcedures= new ArrayList<>();
    private int totalAmountEligible;
    private int amountClaimed;
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<String> getAppliedDiagnosisType() {
        return appliedDiagnosisType;
    }

    public void setAppliedDiagnosisType(List<String> appliedDiagnosisType) {
        this.appliedDiagnosisType = appliedDiagnosisType;
    }

    public List<String> getAppliedProcedures() {
        return appliedProcedures;
    }

    public void setAppliedProcedures(List<String> appliedProcedures) {
        this.appliedProcedures = appliedProcedures;
    }

    public int getTotalAmountEligible() {
        return totalAmountEligible;
    }

    public void setTotalAmountEligible(int totalAmountEligible) {
        this.totalAmountEligible = totalAmountEligible;
    }

    public int getAmountClaimed() {
        return amountClaimed;
    }

    public void setAmountClaimed(int amountClaimed) {
        this.amountClaimed = amountClaimed;
    }

    public int getBalanceAmount() {
        return totalAmountEligible-amountClaimed;
    }

}

package com.healthcare.claims.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaimProcessInputRequest {
    private String claimId;
    private String memberId;
    private LocalDateTime claimSubmissionDate;
    private String diagnosisType;
    private String procedureCode;
    private String facility;
    private String zipCode;
    private int claimAmount;


    public ClaimProcessInputRequest() {
    }

    public ClaimProcessInputRequest(String claimId, String memberId, LocalDateTime claimSubmissionDate, String diagnosisType, String procedureCode, String facility, String zipCode, int claimAmount) {
        this.claimId = claimId;
        this.memberId = memberId;
        this.claimSubmissionDate = claimSubmissionDate;
        this.diagnosisType = diagnosisType;
        this.procedureCode = procedureCode;
        this.facility = facility;
        this.zipCode = zipCode;
        this.claimAmount = claimAmount;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getClaimSubmissionDate() {
        return claimSubmissionDate;
    }

    public void setClaimSubmissionDate(LocalDateTime claimSubmissionDate) {
        this.claimSubmissionDate = claimSubmissionDate;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public String getProcedureCode() {
        return procedureCode;
    }

    public void setProcedureCode(String procedureCode) {
        this.procedureCode = procedureCode;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

}

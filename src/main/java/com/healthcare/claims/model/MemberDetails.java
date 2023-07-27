package com.healthcare.claims.model;

import java.time.LocalDateTime;

public class MemberDetails {
    private String memberId;
    private LocalDateTime planStartDate;
    private LocalDateTime planEndDate;
    private String planName;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(LocalDateTime planStartDate) {
        this.planStartDate = planStartDate;
    }

    public LocalDateTime getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(LocalDateTime planEndDate) {
        this.planEndDate = planEndDate;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

}

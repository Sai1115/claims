package com.healthcare.claims.utils;

import com.healthcare.claims.model.MemberDetails;

import java.time.LocalDateTime;

public class ApplicationUtils {

    public static boolean isValidMember(LocalDateTime claimSubmissionDate, MemberDetails memberDetails) {
        return memberDetails.getMemberId().equalsIgnoreCase("M12345")&&claimSubmissionDate.isAfter(memberDetails.getPlanStartDate()) &&
                claimSubmissionDate.isBefore(memberDetails.getPlanEndDate());
    }
}

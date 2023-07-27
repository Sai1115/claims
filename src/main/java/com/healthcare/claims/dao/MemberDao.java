package com.healthcare.claims.dao;

import com.healthcare.claims.model.MemberDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MemberDao {

    public MemberDetails getMemberByMemberId(String memberId){
        MemberDetails memberDetails= new MemberDetails();
        memberDetails.setMemberId(memberId);
        memberDetails.setPlanStartDate(LocalDateTime.of(2023,01,01,00,00,00));
        memberDetails.setPlanEndDate(LocalDateTime.of(2023,12,31,00,00,00));
        memberDetails.setPlanName("Plan A");
        return memberDetails;
    }
}

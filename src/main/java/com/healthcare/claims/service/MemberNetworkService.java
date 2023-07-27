package com.healthcare.claims.service;

import com.healthcare.claims.model.ClaimProcessInputRequest;
import org.springframework.stereotype.Service;

@Service
public class MemberNetworkService {
    public boolean isInNetwork(ClaimProcessInputRequest claimProcessInputRequest){
        if(claimProcessInputRequest.getZipCode().equals("12345") &&
            claimProcessInputRequest.getFacility().equals("ABCDE")){
            return true;
        }
        return false;
    }
}

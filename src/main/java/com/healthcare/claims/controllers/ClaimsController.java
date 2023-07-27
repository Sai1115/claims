package com.healthcare.claims.controllers;

import com.healthcare.claims.model.ClaimOutputProcessResponse;
import com.healthcare.claims.model.ClaimProcessInputRequest;
import com.healthcare.claims.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ClaimsController {
    @Autowired
    ClaimService claimService;
    @PostMapping("/processClaims")
    public ResponseEntity<ClaimOutputProcessResponse> processClaims(@RequestBody ClaimProcessInputRequest claimProcessInputRequest){
        ClaimOutputProcessResponse claimOutputProcessResponse = claimService.processClaim(claimProcessInputRequest);
        return ResponseEntity.ok().body(claimOutputProcessResponse);
    }
    @GetMapping("/getSampleData")
    public ResponseEntity<ClaimProcessInputRequest> getSampleData(){
        ClaimProcessInputRequest claimProcessInputRequest= new ClaimProcessInputRequest(null,"12345", LocalDateTime.now(),
                "ABCDE","P100","100","1234",100);

        return ResponseEntity.ok().body(claimProcessInputRequest);
    }

}

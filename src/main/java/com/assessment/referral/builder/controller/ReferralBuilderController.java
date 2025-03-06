package com.assessment.referral.builder.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.referral.builder.dto.ApiResponse;
import com.assessment.referral.builder.dto.ReferralBuilderDto;
import com.assessment.referral.builder.service.ReferralBuilderService;

@RestController
@RequestMapping("/referral-builder")
public class ReferralBuilderController {
	
	@Autowired
	private ReferralBuilderService referralBuilderService;
		
	@GetMapping("/get-referral-list")
	public ResponseEntity<ApiResponse<List<ReferralBuilderDto>>> getReferralList() {
		List<ReferralBuilderDto> referralList = referralBuilderService.getReferralList();
		ApiResponse<List<ReferralBuilderDto>> apiResponse = new ApiResponse<List<ReferralBuilderDto>>("success", referralList);
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}
	
	@PostMapping("/create-referral")
	public ResponseEntity<ApiResponse<ReferralBuilderDto>> createReferral(@RequestBody ReferralBuilderDto referralBuilder) {
		ReferralBuilderDto referralBuilderDto = referralBuilderService.createReferral(referralBuilder);
		ApiResponse<ReferralBuilderDto> apiResponse = new ApiResponse<>("success", referralBuilderDto);
		return new ResponseEntity<>(apiResponse, HttpStatus.OK);
	}
	
}

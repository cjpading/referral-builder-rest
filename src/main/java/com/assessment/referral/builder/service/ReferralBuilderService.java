package com.assessment.referral.builder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.referral.builder.dto.ReferralBuilderDto;

@Service
public class ReferralBuilderService {
	private List<ReferralBuilderDto> referralBuilderDtoList = new ArrayList<>();

	// Initialize list containing sample users
	public ReferralBuilderService() {
		createInitialReferralList(1, "John", "Johnson", "jh@email121.com", "0453-283-283");
		createInitialReferralList(2 ,"Matthew", "Lombard", "mat197501@gmail.com", "0453-283-283");
		createInitialReferralList(3, "Joe", "Dickson", "joe@dickson.com", "0453-283-283");
		createInitialReferralList(4, "Scarlett", "Johnson", "scarlet@johnson.com", "0453-283-283");
		createInitialReferralList(5, "Peters", "Rhonda", "peter101@yahoo.com", "0453-283-283");
	}
	
	private void createInitialReferralList(int id, String givenName, String surname, String email, String phone) {
		ReferralBuilderDto referralBuilderDto = new ReferralBuilderDto();
		referralBuilderDto.setId(id);
		referralBuilderDto.setGivenName(givenName);
		referralBuilderDto.setSurName(surname);
		referralBuilderDto.setEmail(email);
		referralBuilderDto.setPhone(phone);
		referralBuilderDtoList.add(referralBuilderDto);
	}
	
	public List<ReferralBuilderDto> getReferralList() {
		return referralBuilderDtoList;
	}
	
	public ReferralBuilderDto createReferral(ReferralBuilderDto referralDto) {
		referralDto.setId(referralBuilderDtoList.size() + 1);
		referralBuilderDtoList.add(referralDto);
		return referralDto;
	}
}

package com.octacore.stock.ws.resource.converter.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.octacore.stock.alert.domain.ContactDetails;
import com.octacore.stock.alert.domain.PersonalDetails;
import com.octacore.stock.alert.domain.Salutation;
import com.octacore.stock.alert.domain.User;
import com.octacore.stock.dto.SalutationDTO;
import com.octacore.stock.dto.UserDTO;

@Component("userDomainToDtoConverter")
public class UserConverter implements Converter<User, UserDTO> {

	@Autowired
	private Converter<Salutation, SalutationDTO> salutationConverter;

	public UserDTO convert(User source) {
		if (source != null) {
			UserDTO target = new UserDTO();

			target.setId(source.getId());
			target.setUsername(source.getUsername());

			assignContactDetails(target, source.getContactDetails());
			assignPersonalDetails(target, source.getPersonalDetails());

			return target;
		}
		return null;
	}

	private void assignPersonalDetails(UserDTO target,
	        PersonalDetails personalDetails) {
		if (personalDetails != null) {
			target.setFirstName(personalDetails.getFirstName());
			target.setLastName(personalDetails.getLastName());
			target.setSalutation(salutationConverter.convert(personalDetails
			        .getSalutation()));
		}
	}

	private void assignContactDetails(UserDTO target,
	        ContactDetails contactDetails) {

		if (contactDetails != null) {
			target.setEmailAddress(contactDetails.getEmailAddress());
			target.setMobileNumber(contactDetails.getMobileNumber());
			target.setAddress(contactDetails.getAddress());
		}

	}
}

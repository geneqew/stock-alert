package com.octacore.stock.ws.resource.converter.domain;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.convert.converter.Converter;
import org.springframework.test.util.ReflectionTestUtils;

import com.octacore.stock.alert.domain.ContactDetails;
import com.octacore.stock.alert.domain.PersonalDetails;
import com.octacore.stock.alert.domain.Salutation;
import com.octacore.stock.alert.domain.User;
import com.octacore.stock.dto.SalutationDTO;
import com.octacore.stock.dto.UserDTO;

@RunWith(MockitoJUnitRunner.class)
public class UserConverterTest {

	@InjectMocks
	private Converter<User, UserDTO> classUnderTest = new UserConverter();;

	@Mock
	private Converter<Salutation, SalutationDTO> salutationConverter;

	@Mock
	private User user;
	@Mock
	private ContactDetails contactDetails;
	@Mock
	private PersonalDetails personalDetails;

	@Before
	public void setUp() {
		when(salutationConverter.convert(any(Salutation.class))).thenReturn(
		        SalutationDTO.MR);

		when(personalDetails.getId()).thenReturn(1000L);
		when(personalDetails.getFirstName()).thenReturn("foo");
		when(personalDetails.getLastName()).thenReturn("bar");
		when(personalDetails.getSalutation()).thenReturn(Salutation.MR);

		when(contactDetails.getId()).thenReturn(101L);
		when(contactDetails.getAddress()).thenReturn("ilog pasig");
		when(contactDetails.getEmailAddress()).thenReturn("mrfoobar@mfb.com");
		when(contactDetails.getMobileNumber()).thenReturn("123456789");

		when(user.getId()).thenReturn(201L);
		when(user.getUsername()).thenReturn("mrfoobar");
		when(user.getPassword()).thenReturn("passw0rd");
		when(user.getContactDetails()).thenReturn(contactDetails);
		when(user.getPersonalDetails()).thenReturn(personalDetails);
	}

	@Test
	public void shouldResultToNullWhenSourceIsNull() {
		User source = null;

		UserDTO target = classUnderTest.convert(source);

		assertNull(target);
	}

	@Test
	public void shouldNotSetPersonalDetailsFieldWhenSourceIsNull() {
		when(user.getPersonalDetails()).thenReturn(null);

		UserDTO result = classUnderTest.convert(user);

		assertNotNull(result);
		assertEquals(Long.valueOf(201L), result.getId());
		assertNull(result.getFirstName());
		assertNull(result.getLastName());
		assertNull(result.getSalutation());
	}

	@Test
	public void shouldNotSetContactDetailsWhenSourceIsNull() {
		
	}
}

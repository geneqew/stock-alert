package com.octacore.stock.ws.resource;

import javax.ws.rs.core.Response;

import com.octacore.stock.dto.SalutationDTO;

/**
 * Resource interface for user management
 * 
 * @author Arian Dave G. Mabanag
 *
 */
public interface UserResource {

	/**
	 * Retrieve a user by id
	 * 
	 * @param id
	 *            id of the user to retrieve
	 * @return <ul>
	 *         <li>HTTP Status 200 [OK] when successful. Message body contains
	 *         the user which matches the id</li>
	 *         <li>HTTP Status 404 [Not Found] when id specified does not match
	 *         an existing user</li>
	 *         <li>HTTP Status 500 [Server Error] when an error occurred while
	 *         processing the request</li>
	 *         </ul>
	 */
	Response get(Long id);

	/**
	 * Find a user using the specified filters
	 * 
	 * @param username
	 *            username filter
	 * @param firstName
	 *            first name filter
	 * @param lastName
	 *            last name filter
	 * @param salutation
	 *            salutation filter
	 * @param emailAddress
	 *            email address filter
	 * @param mobileNumber
	 *            mobile number filter<jaxb:bindings version="2.0"
	 *            xmlns:jaxb="http://java.sun.com/xml/ns/jaxb"
	 *            xmlns:xs="http://www.w3.org/2001/XMLSchema"
	 *            xmlns:annox="http://annox.dev.java.net"
	 *            jaxb:extensionBindingPrefixes="annox">
	 * @param address
	 *            address filter
	 * 
	 * @return <ul>
	 *         <li>HTTP Status 200 [OK] when successful, message body contains a
	 *         list of all the matching users</li>
	 *         <li>HTTP Status 404 [Not Found] when no records were found to
	 *         match the specified filters</li>
	 *         <li>HTTP Status 400 [Bad Request] when one or more parameter
	 *         specified is invalid</li>
	 *         <li>HTTP Status 500 [Server Error] when an error occurred while
	 *         attempting to process the request</li>
	 *         </ul>
	 */
	Response get(String username, String firstName, String lastName,
			SalutationDTO salutation, String emailAddress, String mobileNumber,
			String address);

}

package com.octacore.stock.ws.resource.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.core.convert.ConversionService;

import com.octacore.stock.dto.SalutationDTO;
import com.octacore.stock.ws.resource.UserResource;

@Path("user")
public class UserResourceImpl implements UserResource {

	private ConversionService conversionService;

	/**
	 * {@inheritDoc}
	 */
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GET
	public Response get(@QueryParam("username") String username,
			@QueryParam("firstName") String firstName,
			@QueryParam("lastName") String lastName,
			@QueryParam("salutation") SalutationDTO salutation,
			@QueryParam("emailAddress") String emailAddress,
			@QueryParam("mobileNumber") String mobileNumber,
			@QueryParam("address") String address) {
		// TODO Auto-generated method stub
		return null;
	}

}

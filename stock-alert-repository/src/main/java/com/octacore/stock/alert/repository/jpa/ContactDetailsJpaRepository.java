package com.octacore.stock.alert.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.octacore.stock.alert.domain.ContactDetails;

public interface ContactDetailsJpaRepository extends
		JpaRepository<ContactDetails, Long> {

}

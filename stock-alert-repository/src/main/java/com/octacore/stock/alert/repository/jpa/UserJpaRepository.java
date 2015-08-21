package com.octacore.stock.alert.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.octacore.stock.alert.domain.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {

}

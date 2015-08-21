package com.octacore.stock.alert.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.octacore.stock.alert.domain.Stock;

@Repository
public interface StockJpaRepository extends JpaRepository<Stock, Long> {

}

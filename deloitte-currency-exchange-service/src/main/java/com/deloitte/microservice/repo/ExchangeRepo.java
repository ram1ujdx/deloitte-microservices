package com.deloitte.microservice.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deloitte.microservice.model.ExchangeRate;

public interface ExchangeRepo extends JpaRepository<ExchangeRate, Integer> {

	//@Query("from ExchangeRate where fromCur=:fromCur and toCur=:toCur")
	ExchangeRate findByFromCurAndToCur(String fromCur, String toCur);
	
}

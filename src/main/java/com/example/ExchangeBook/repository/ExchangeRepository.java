package com.example.ExchangeBook.repository;

import com.example.ExchangeBook.model.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {
}

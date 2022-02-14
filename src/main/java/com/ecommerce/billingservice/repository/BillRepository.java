package com.ecommerce.billingservice.repository;

import com.ecommerce.billingservice.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}

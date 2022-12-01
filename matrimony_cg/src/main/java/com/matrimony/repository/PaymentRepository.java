package com.matrimony.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}

package com.matrimony.service;

import java.util.List;

import com.matrimony.entity.Payment;

public interface PaymentService {

	Payment savePayment(Payment payment);

	List<Payment> getAllPayments();

	Payment getPaymentById(long id);

	Payment updatePayment(Payment payment, long id);

	void deletePayment(long id);

}

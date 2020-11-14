package com.tourism.springboot.converters;

import java.util.ArrayList;
import java.util.List;

import com.tourism.springboot.dto.PaymentDto;
import com.tourism.springboot.entities.Payment;

public class PaymentConverter {

	public static Payment paymentDtoToPayment(PaymentDto paymentDto) {
		Payment payment = new Payment();
		if (paymentDto != null) {
			payment.setId(paymentDto.getId());
			payment.setPayMethod(paymentDto.getPayMethod());
			payment.setCardName(paymentDto.getCardName());
			payment.setCardNum(paymentDto.getCardNum());
			payment.setExpDate(paymentDto.getExpDate());
			payment.setCardCVC(paymentDto.getCardCVC());
			payment.setPayAmount(paymentDto.getPayAmount());

		}
		try {
			paymentDto = null;
		} catch (NullPointerException ne) {
			System.out.println(ne);
		}
		return payment;

	}

	public static List<PaymentDto> paymentToPaymentDto(List<Payment> paymentlist) {
		List<PaymentDto> listPaymentDto = new ArrayList<>();
		if (paymentlist != null) {
			for (Payment payment : paymentlist) {
				PaymentDto paymentDto = new PaymentDto();
				paymentDto.setId(payment.getId());
				paymentDto.setPayMethod(payment.getPayMethod());
				paymentDto.setCardName(payment.getCardName());
				paymentDto.setCardNum(payment.getCardNum());
				paymentDto.setExpDate(payment.getExpDate());
				paymentDto.setCardCVC(payment.getCardCVC());
				payment.setPayAmount(payment.getPayAmount());
				listPaymentDto.add(paymentDto);
			}
			try {
				paymentlist = null;
			} catch (NullPointerException ne) {
				System.out.println(ne);
			}
		}
		return listPaymentDto;
	}

}

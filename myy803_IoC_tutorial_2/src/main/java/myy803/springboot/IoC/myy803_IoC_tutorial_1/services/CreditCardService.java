package myy803.springboot.IoC.myy803_IoC_tutorial_1.services;

import org.springframework.stereotype.Service;

@Service
public class CreditCardService implements PaymentService{

	@Override
	public void executePayment() {
		System.out.println("Executing Payment");
	}
}

package myy803.springboot.IoC.myy803_IoC_tutorial_1.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.OrderService;
import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.PaymentService;

@Controller
public class OnlineStoreController {
	
	private OrderService orderService;
	private PaymentService paymentService;
	
	public OnlineStoreController(OrderService orderService, PaymentService paymentService) {
		super();
		this.orderService = orderService;
		this.paymentService = paymentService;
	}

	public void acceptIncomingRequest(String requestedOperation) {
		System.out.println("Accepted a request to: " + requestedOperation);
	
		if(requestedOperation.equals("Deliver Order"))
			orderService.deliverOrder();
		else
			if(requestedOperation.equals("Pay Order"))
				paymentService.executePayment();
			else
				System.err.println("Accepted a request that does not match a service");
	}
}

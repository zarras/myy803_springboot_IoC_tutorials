package myy803.springboot.IoC.myy803_IoC_tutorial_1.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;

import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.CreditCardService;
import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.OrderService;
import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.PaymentService;
import myy803.springboot.IoC.myy803_IoC_tutorial_1.services.PaypalService;

@Controller
public class OnlineStoreController {
	
	private OrderService orderService;
	private HashMap<String,PaymentService> paymentServices;

	public OnlineStoreController(OrderService orderService, 
			CreditCardService creditCardService,
			PaypalService paypalService) {
		super();
		this.orderService = orderService;
		paymentServices = new HashMap<String,PaymentService>();
		paymentServices.put("Pay Order with Credit Card", creditCardService);
		paymentServices.put("Pay Order with Paypal", paypalService);

	}

	public void acceptIncomingRequest(String requestedOperation) {
		System.out.println("Accepted a request to: " + requestedOperation);
		
		if(requestedOperation.equals("Deliver Order"))
			orderService.deliverOrder();
		else
			paymentServices.get(requestedOperation).executePayment();
	}
}

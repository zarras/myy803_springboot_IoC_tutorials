package myy803.springboot.IoC.myy803_IoC_tutorial_1.services;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

	public void deliverOrder() {
		System.out.println("Delivering Order");
	}
}

package myy803.springboot.IoC.myy803_IoC_tutorial_0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import myy803.springboot.IoC.myy803_IoC_tutorial_1.OnlineStoreApp;
import myy803.springboot.IoC.myy803_IoC_tutorial_1.controller.OnlineStoreController;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = OnlineStoreApp.class)
class OnlineStoreControllerTest {

    @Autowired
    private OnlineStoreController controller;

    @Test
    void controllerIsAutowired() {
    	Assertions.assertNotNull(controller);
    }
    
    @Test
    void deliverOrderTest() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        controller.acceptIncomingRequest("Deliver Order");

        assertTrue(output.toString().contains("Delivering Order"));
    }

    @Test
    void payOrderTest() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        controller.acceptIncomingRequest("Pay Order");

        assertTrue(output.toString().contains("Executing Payment"));
    }
}
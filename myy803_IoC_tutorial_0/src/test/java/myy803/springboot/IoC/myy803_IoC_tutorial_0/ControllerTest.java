package myy803.springboot.IoC.myy803_IoC_tutorial_0;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.*;

@SpringBootTest(classes=AutoWiredPropertyApp.class)
class ControllerTest {

    @Autowired
    private Controller controller;

    @Test
    void controllerIsAutowired() {
    	Assertions.assertNotNull(controller);
    }
    
    @Test
    void requesShouldPrintAcceptedMessage() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        controller.request("DELETE_USER");

        String output = outputStream.toString();
        Assertions.assertTrue(output.contains("Accepted a request to: DELETE_USER"));
    }
}
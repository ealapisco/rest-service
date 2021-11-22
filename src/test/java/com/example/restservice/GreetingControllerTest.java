package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {

    @Test
    void greetingTest() {
        GreetingController gc = new GreetingController();
        Greeting greetingClass = gc.greeting("test");
        String greeting = greetingClass.getContent();
        String expectedGreeting = "Hello, test!";
        assertEquals(greeting, expectedGreeting);
    }


}

package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    String hello;

    public WelcomeController(@Value("${welcome.message}")String message){
        this.hello = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return hello;
    }
}
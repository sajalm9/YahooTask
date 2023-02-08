package com.helloWorld.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value="Hello World")
    public String HelloWorld(){
        return "Hello World";
    }
}

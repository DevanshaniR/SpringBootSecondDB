package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //default method to GET requests
    @RequestMapping("/hello")
    public String sayHi(){
        return "say Hi";
    }
}

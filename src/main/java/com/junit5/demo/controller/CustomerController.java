package com.junit5.demo.controller;

import com.junit5.demo.model.Request;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

//@Controller
//@RestControllerAdvice
@Component
public class CustomerController {

//@PostMapping("/api/customers")
public String createCustomer(@RequestBody Request request){
        if(request.getA()>0) {
            int w = 10;
            int res = w / request.getA();
            return String.valueOf(res);
        }
        return "error";
}
}

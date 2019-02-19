package com.junit5.demo.controller;

import com.junit5.demo.model.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class CustomerControllerTest {

    private CustomerController customerController;

    @BeforeEach
    void setUp() {
        customerController=new CustomerController();
    }

    @Test
    void createCustomer() throws Exception {
    //Arrange
        Request request=new Request();
        request.setA(0);
        String exp= "divide by zero";
        String test=null;
        assertThrows(Exception.class,()->{customerController.createCustomer(request);});
    }

    @Test
    void createCustomerAssume() throws Exception {
        //Arrange
        Request request=new Request();
        request.setA(3);
        assumeTrue(request.getA()!=0);
        String expected="error";
        assertEquals(expected,customerController.createCustomer(request));

    }

    @Test
    @DisplayName("Test Success")
    void createCustomerDisplayName() throws Exception {
        //Arrange
        Request request=new Request();
        request.setA(3);
        assumeTrue(request.getA()>0);
        String expected="3";
        assertEquals(expected,customerController.createCustomer(request));

    }
}
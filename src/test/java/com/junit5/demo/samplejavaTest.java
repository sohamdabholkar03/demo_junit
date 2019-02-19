package com.junit5.demo;

import com.junit5.demo.model.Request;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class samplejavaTest {

    private samplejava java;

    @BeforeEach
    public void setUp() throws Exception {
        java=new samplejava();
    }

    @Test
    @DisplayName("success happy")
    public void printarray() {
        //ACT
        List<Integer> cust_id=new ArrayList<>();
        cust_id.add(100);
        Integer expexted=0;
        Integer a=java.printarray(Request.builder().customerid(cust_id).build());
        assertEquals(expexted,a);

    }

    @Test
    @DisplayName("success assume")
    public void printarray_assumetrue() {
        //ACT
        List<Integer> cust_id=new ArrayList<>();
        cust_id.add(100);
        Integer expexted=2;
        Integer a=java.printarray(Request.builder().customerid(cust_id).a(5).build());
        assumeTrue(a>1);
        assertEquals(expexted,a);

    }
}
package com.junit5.demo;

import com.junit5.demo.model.Request;

import java.util.ArrayList;
import java.util.List;

public class samplejava {

    public samplejava()
    {

    }

    public int printarray(Request request)
    {


        List<Integer> array=new ArrayList<>();
        if(request.getA()>=5)
        {
           int p = 10/request.getA();
           return p;
        }
        System.out.println(array);
        return 0;
    }
}

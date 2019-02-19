package com.junit5.demo.model;

import lombok.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private List<Integer> customerid;
    private int a;
}

package com.example.interceptor2.controller;

import com.example.interceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @GetMapping
    public Month month (HttpServletRequest request ){
        return (Month) request.getAttribute("MonthInterceptor-month");
    }
}

package com.example.interceptor2.interceptors;

import com.example.interceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptors implements HandlerInterceptor {

    //posizione della lista scorretta, è qui solo per fini didattici
    public static List<Month> months = new ArrayList<>(Arrays.asList(
            new Month(1, "January", "Gennaio", "der Januar"),
            new Month(2, "February", "Febbraio", "der Februar"),
            new Month(3, "March", "Marzo", "der März"),
            new Month(4, "April", "Aprile", "der April"),
            new Month(5, "May", "Maggio", "der Mai"),
            new Month(6, "June", "Giugno", "der Juni")
    ));

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberString = request.getHeader("monthNumber");
        if (monthNumberString == null || monthNumberString.isEmpty()) {
            response.setStatus(400);
        }else {
            int monthnumber = Integer.parseInt(monthNumberString);
            Optional<Month> month = months.stream().filter(singleMonth -> singleMonth.getMonthNumber() == monthnumber).findFirst();

            if (month.isPresent()) {
                request.setAttribute("MonthInterceptor-month", month.get());
            } else {
                request.setAttribute("MonthInterceptor-month", new Month(Integer.parseInt(monthNumberString), "nope", "nope", "nope"));
            }
            response.setStatus(200);
        }

        return true;


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Post handle logic
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // After completion logic
    }
}

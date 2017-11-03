package com.practice.exptrack.main;

import com.practice.exptrack.repository.ExpenseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExpenseTrackerApplication {
    public static void main(String...args){
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }
    @Bean
    public ExpenseRepository expenseRepository(){
        return new ExpenseRepository();
    }

}

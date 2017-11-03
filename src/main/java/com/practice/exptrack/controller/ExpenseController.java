package com.practice.exptrack.controller;

import com.practice.exptrack.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private ExpenseRepository repositoryl;
    public ExpenseController(ExpenseRepository repos){
        this.repository;
    }
}

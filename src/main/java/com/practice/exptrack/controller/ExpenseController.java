package com.practice.exptrack.controller;

import com.practice.exptrack.domain.Expense;
import com.practice.exptrack.repository.ExpenseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense-tracker")
public class ExpenseController {
    ExpenseRepository expenseRepository = new ExpenseRepository();
    @PutMapping("{id}")
    public ResponseEntity<Expense> update(@RequestBody long id, @RequestBody Expense expense) {

        Expense expenseEntry = expenseRepository.update(id, expense);
        if (expenseEntry != null) {
            return new ResponseEntity<>(expenseEntry, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

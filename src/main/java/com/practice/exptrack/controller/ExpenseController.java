package com.practice.exptrack.controller;

import com.practice.exptrack.domain.Expense;
import com.practice.exptrack.repository.ExpenseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expense-tracker")
public class ExpenseController {
    private ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository r){
        this.expenseRepository = r;
    }
    @PutMapping("{id}")
    public ResponseEntity<Expense> update(@RequestBody long id, @RequestBody Expense expense) {

        Expense expenseEntry = expenseRepository.update(id, expense);
        if (expenseEntry != null) {
            return new ResponseEntity<>(expenseEntry, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("{payor}")
    public ResponseEntity<List<Expense>> list(@PathVariable String payor) {

        List<Expense> list = expenseRepository.list(payor);

        return new ResponseEntity<List<Expense>>(list, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Expense> create(@RequestBody Expense expense) {
        long id = expenseRepository.create(expense);

        return new ResponseEntity(id, HttpStatus.CREATED);
    }
}

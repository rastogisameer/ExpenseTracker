package com.practice.exptrack.controller;

import com.practice.exptrack.domain.Expense;
import com.practice.exptrack.repository.ExpenseRepository;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertThat;

public class ExpenseControllerTest {
    private ExpenseRepository expenseRepository = new ExpenseRepository();
    private ExpenseController controller = new ExpenseController();


    @Test
    public void testUpdateExpense(){
    Expense expected = new
        Expense("Prasad Kamat", 20.50, "Snacks", new Date());

        ResponseEntity response = controller.update(1L, expected);
        System.out.println("response.getBody() = "+response.getBody());
        assert(response.getStatusCode()).equals(HttpStatus.OK);
        assert(response.getBody()).equals(expected);

    }
}

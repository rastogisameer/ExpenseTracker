package com.practice.exptrack.repository;

import com.practice.exptrack.domain.Expense;
import org.junit.Test;

import java.util.Map;
import java.util.Date;
import static org.junit.Assert.*;

public class ExpenseRepositoryTest {
        @Test
        public void createExpense() throws Exception {

            ExpenseRepository exprep = new ExpenseRepository();
            Expense expense = exprep.create("Mihir",2000,10,new Date());
            Expense compareExpense = new Expense("Mihir",2000,10,new Date());
            assertEquals(expense,compareExpense);
        }

    }

}

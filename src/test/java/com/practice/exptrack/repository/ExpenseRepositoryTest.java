package com.practice.exptrack.repository;

import com.practice.exptrack.domain.Expense;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Date;
import static org.junit.Assert.*;

public class ExpenseRepositoryTest {
        @Test
        public void createExpense() throws Exception {
            String payor1 = "Sameer";
            Date dt = new Date();
            Expense e1 = new Expense(payor1,2000,"10",dt);
            ExpenseRepository exprep = new ExpenseRepository();
            Long id  = exprep.create(e1);
            List l2 = exprep.list(payor1);
            assertTrue(l2.size()==1);
        }



    private ExpenseRepository repository;

    @Before
    public void setup(){
        repository = new ExpenseRepository();
    }
    @After
    public void tearDown(){
        repository = null;
    }
    @Test
    public void testListExpensesFromEmptyRepository(){

        String payor = "Sameer";
        List<Expense> list = repository.list(payor);
        assertNull(list);

    }
    @Test
    public void testListExpenseFromRepositoryHavingMultiplePayors(){
        String payor1 = "Sameer";
        Expense e1 = new Expense(payor1, 10, "tea", new Date());
        long id1 = repository.create(e1);

        String payor2 = "Prasad";
        Expense e2 = new Expense(payor2, 30, "bread", new Date());
        long id2 = repository.create(e2);


        List<Expense> list = repository.list(payor1);

        assertEquals(list.get(0), e1);
    }
    @Test
    public void testListExpenseFromRepositoryHavingSinglePayor(){

        String payor1 = "Sameer";
        Expense e1 = new Expense(payor1, 10, "tea", new Date());
        long id1 = repository.create(e1);

        String payor2 = "Sameer";
        Expense e2 = new Expense(payor2, 20, "coffee", new Date());
        long id2 = repository.create(e2);


        List<Expense> list = repository.list(payor1);

        assertEquals(list.size(), 2);
    }
    @Test
    public void testListExpenseFromRepositoryNotHavingThePayor(){
        String payor1 = "Prasad";
        Expense e1 = new Expense(payor1, 10, "tea", new Date());
        long id1 = repository.create(e1);

        String payor2 = "Prasad";
        Expense e2 = new Expense(payor2, 20, "coffee", new Date());
        long id2 = repository.create(e2);

        String payor3 = "Sameer";

        List<Expense> list = repository.list(payor3);

        assertEquals(list.size(), 0);
    }

}

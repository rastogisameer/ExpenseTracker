package com.practice.exptrack.repository;

import com.practice.exptrack.domain.Expense;

import java.util.*;

public class ExpenseRepository {

    private Map<Long, Expense> repository = new HashMap<Long, Expense>();

    public List<Expense> list(String payor) {

        Collection<Expense> expenses = repository.values();

        List<Expense> list = new ArrayList<Expense>();

        expenses.forEach((Expense expense) -> {
            if(expense.getPayor().equalsIgnoreCase(payor)) {
                list.add(expense);
            }
        });
        return list;
    }

    public long create(Expense e1) {

        e1.setId(repository.size() + 1);
        repository.put(e1.getId(), e1);
        return e1.getId();

    }

    public Expense update(long id, Expense expense) {
        repository.replace(id, expense);
        expense.setId(id);
        return expense;
    }
}

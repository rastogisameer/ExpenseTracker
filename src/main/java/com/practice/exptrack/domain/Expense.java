package com.practice.exptrack.domain;

import java.util.Date;

public class Expense {
    private long id;
    private String payor;
    private double amount;
    private int reasonCode;
    private Date expenseDate;

    public Expense(String payor, double amount, int reasonCode, Date expenseDate) {
        this.payor = payor;
        this.amount = amount;
        this.reasonCode = reasonCode;
        this.expenseDate = expenseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPayor() {
        return payor;
    }

    public void setPayor(String payor) {
        this.payor = payor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(int reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    @Override
    public boolean equals(Object expense){
        if (this == expense) return true;
        if (expense == null || getClass() != expense.getClass()) return false;

        Expense exp = (Expense) expense;

        if (id != exp.id) return false;
        if (payor != exp.payor) return false;
        if (amount != exp.amount) return false;
        if (reasonCode != exp.reasonCode) return false;
        return expenseDate != null ? expenseDate.equals(exp.expenseDate) : exp.expenseDate == null;

    }
}

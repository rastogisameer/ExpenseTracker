package com.practice.exptrack.domain;

import java.util.Date;

public class Expense {
    private long id;
    private String payor;
    private double amount;
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private Date expenseDate;

    public Expense(String payor, double amount, String reason, Date expenseDate) {
        this.payor = payor;
        this.amount = amount;
        this.reason = reason;
        this.expenseDate = expenseDate;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Expense e = (Expense)o;
        if (id != e.id) return false;
        if (! payor.equalsIgnoreCase(e.payor)) return false;
        if (amount != e.amount) return false;
        if (! reason.equalsIgnoreCase(e.reason)) return false;
        return expenseDate != null ? expenseDate.equals(e.expenseDate) : e.expenseDate == null;

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



    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }
}

package com.example.comholic.latihantampilandasar.model;

/**
 * Created by Pleret on 9/25/2016.
 */

public class ExpensesModel {
    private String category;
    private int amount;
    private String isRepeadly;
    private String date;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String isRepeadly() {
        return isRepeadly;
    }

    public void setRepeadly(String repeadly) {
        isRepeadly = repeadly;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

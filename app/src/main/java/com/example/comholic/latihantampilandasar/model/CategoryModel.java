package com.example.comholic.latihantampilandasar.model;

import java.util.ArrayList;

/**
 * Created by Pleret on 8/27/2016.
 */
public class CategoryModel {
    private static ArrayList<String> name;
    private int idCategory;

    private static CategoryModel category = null;

    public static CategoryModel newInstance(){
        if(category == null) {
            category = new CategoryModel();
            name = new ArrayList<String>();
            name.add("Monthly Shopping");
            name.add("Credit card bill");
            name.add("House bill");
            name.add("Transportation");

        }

        return category;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public void addName(String tmp) {
        name.add(tmp);
    }
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }


}





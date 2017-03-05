package com.example.comholic.latihantampilandasar.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Pleret on 9/28/2016.
 */

public class DBHelper extends SQLiteOpenHelper {
    final static String DB_NAME = "DB_REC.db";
    final static int VERSION = 1;

    final static String CREATE_CATEGORY = "CREATE TABLE category (id INTEGER PRIMARY_KEY,name TEXT)";
    final static String CREATE_EXPENSES = "CREATE TABLE expenses (id INTEGER PRIMARY_KEY," +
            "category TEXT, " +
            "date TEXT," +
            "amount TEXT," +
            "is_repeatly TEXT," +
            ")";
    final static String CREATE_INCOME = "CREATE TABLE expenses (id INTEGER PRIMARY_KEY," +
            "category TEXT, " +
            "date TEXT," +
            "amount TEXT" +
            ")";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    public void onCretae (SQLiteDatabase db, String comment){
        db.execSQL(comment);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

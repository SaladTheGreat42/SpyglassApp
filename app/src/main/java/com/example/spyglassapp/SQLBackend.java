package com.example.spyglassapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLBackend extends SQLiteOpenHelper {

    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String USER_NAME = "USER_NAME";
    public static final String USER_PASSWORD = "USER_PASSWORD";
    public static final String USER_ACTIVE = "USER_ACTIVE";
    public static final String ID = "ID";

    public SQLBackend(@Nullable Context context) {
        super(context, "SpyGlassLite.db", null, 1);
    }

    //this is called the first time a database is accessed. There should be code here to create new database
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + USER_NAME + " TEXT, " + USER_PASSWORD + " TEXT, " + USER_ACTIVE + " BOOL)";

        db.execSQL(createTableStatement);

    }//end onCreate

    //when you upgrade a database
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }//end onUpgrade


}

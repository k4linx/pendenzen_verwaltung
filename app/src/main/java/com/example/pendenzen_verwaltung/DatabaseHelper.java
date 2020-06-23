package com.example.pendenzen_verwaltung;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "uk_01";
    public static final String TABLE_TITLE_NAME = "title_table";
    public static final String TABLE_DESCRIPTION_NAME = "description_table";
    public static final String TABLE_DATE_NAME = "date_table";
    public static final String TABLE_IMPORTANCE_NAME = "importance_table";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME ,null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

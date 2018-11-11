package com.example.mashuda11.mysqlitedatabasedemo;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class DBHelper extends SQLiteOpenHelper {

private static final String DATABASE_NAME= "Student.db";
private static final String TABLE_NAME= "Student_details";

private static final String ID = "_id";
private static final String NAME = "Name";
private static final String AGE = "Age";
private static final int VERSION_NUMBER = 1;


    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+"( "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+" VARCHAR(255), "+AGE+" INTEGER); ";
    private  Context context;



    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            Toast.makeText(context, " onCreate is called", Toast.LENGTH_LONG).show();

            SQLiteDatabase.execSQL(CREATE_TABLE);
        } catch (Exception e) {

            Toast.makeText(context, "Exception : " + e, Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

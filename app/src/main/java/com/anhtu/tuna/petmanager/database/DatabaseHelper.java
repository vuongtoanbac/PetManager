package com.anhtu.tuna.petmanager.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.anhtu.tuna.petmanager.model.PetDao;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "petstore";
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(PetDao.SQL_PET);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("Drop table if exists " + PetDao.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}

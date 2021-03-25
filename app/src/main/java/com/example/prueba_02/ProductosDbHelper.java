package com.example.prueba_02;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ProductosDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Productos.db";

    public ProductosDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + ProductoContract.ProductoEntry.TABLE_NAME + " ("
                + ProductoContract.ProductoEntry.ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + ProductoContract.ProductoEntry.NOMBRE + " TEXT NOT NULL,"
                + ProductoContract.ProductoEntry.PRECIO + " INTEGER NOT NULL,"
                + "UNIQUE (" + ProductoContract.ProductoEntry.ID + "))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }

}




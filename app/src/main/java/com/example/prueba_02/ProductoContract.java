package com.example.prueba_02;

import android.provider.BaseColumns;

public class ProductoContract {

    public static abstract class ProductoEntry implements BaseColumns {
        public static final String TABLE_NAME ="productos";

        public static final String ID = "id";
        public static final String NOMBRE = "nombre";
        public static final String PRECIO = "precio";
    }
}

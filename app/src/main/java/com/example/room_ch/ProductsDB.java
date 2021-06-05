package com.example.room_ch;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities={Product.class}, version=2)
public abstract class ProductsDB extends RoomDatabase {
    abstract Manager manager();

    private static final String DB_NAME = "minechervi.db";
    private static volatile com.example.room_ch.ProductsDB INSTANCE = null;

    synchronized static com.example.room_ch.ProductsDB get(Context ctxt) {

        if (INSTANCE == null) {
            INSTANCE = create(ctxt, false);
        }
        return (INSTANCE);
    }

    static com.example.room_ch.ProductsDB create(Context ctxt, boolean memoryOnly) {
        RoomDatabase.Builder<com.example.room_ch.ProductsDB> b;
        if (memoryOnly) {
            b = Room.inMemoryDatabaseBuilder(ctxt.getApplicationContext(),
                    com.example.room_ch.ProductsDB.class);
        } else {
            b = Room.databaseBuilder(ctxt.getApplicationContext(), com.example.room_ch.ProductsDB.class,
                    DB_NAME);
        }
        return (b.createFromAsset("room_db.db").build());

    }
}

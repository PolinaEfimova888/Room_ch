package com.example.room_ch;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities={Category.class}, version=2)
public abstract class CategoryDB extends RoomDatabase {
    abstract ManagerCategory manager_category();

    private static final String DB_NAME = "minecategories.db";
    private static volatile com.example.room_ch.CategoryDB INSTANCE = null;

    synchronized static com.example.room_ch.CategoryDB get(Context ctxt) {

        if (INSTANCE == null) {
            INSTANCE = create(ctxt, false);
        }
        return (INSTANCE);
    }

    static com.example.room_ch.CategoryDB create(Context ctxt, boolean memoryOnly) {
        RoomDatabase.Builder<com.example.room_ch.CategoryDB> b;
        if (memoryOnly) {
            b = Room.inMemoryDatabaseBuilder(ctxt.getApplicationContext(),
                    com.example.room_ch.CategoryDB.class);
        } else {
            b = Room.databaseBuilder(ctxt.getApplicationContext(), com.example.room_ch.CategoryDB.class,
                    DB_NAME);
        }
        return (b.createFromAsset("room_db.db").build());

    }
}
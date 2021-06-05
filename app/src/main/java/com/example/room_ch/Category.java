package com.example.room_ch;

import androidx.annotation.NonNull;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.room.Update;

import java.util.Locale;

@Entity(tableName = "Categories")
public class Category {

    @PrimaryKey
    @NonNull
    int _id;
    @NonNull
    String category_name;

    public Category(int _id, @NonNull String category_name) {
        this._id = _id;
        this.category_name = category_name;
    }
}

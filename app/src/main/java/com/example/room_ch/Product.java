package com.example.room_ch;

import androidx.annotation.NonNull;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Update;

import java.util.Locale;

@Entity(tableName = "Products")
public class Product {

    @PrimaryKey
    @NonNull
    int _id;
    @NonNull
    String product_name, count;
    @NonNull
    int category_id;

    public Product(int _id, @NonNull String product_name, @NonNull String count, @NonNull int category_id) {
        this._id = _id;
        this.product_name = product_name;
        this.count = count;
        this.category_id = category_id;
    }
}
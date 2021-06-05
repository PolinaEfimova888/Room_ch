package com.example.room_ch;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Manager {
    @Query("SELECT * FROM Products ORDER BY _id")
    List<Product> selectAll();

    @Query("SELECT * FROM Products WHERE _id=:id")
    Product findById(int id);

    @Query("SELECT COUNT(_id) FROM Products")
    int getNumberOfRows();

    @Query("DELETE FROM Products WHERE _id=:id")
    void deleteItem(int id);

    @Insert
    void insert(Product... Products);

    @Delete
    void delete(Product... Products);

    @Update
    void update(Product... Products);
}

package com.example.room_ch;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ManagerCategory {
    @Query("SELECT * FROM categories ORDER BY _id")
    List<Category> selectAll();

    @Query("SELECT * FROM categories WHERE _id=:id")
    Category findById(int id);

    @Insert
    void insert(Category... categories);

    @Delete
    void delete(Category... categories);

    @Update
    void update(Category... categories);

}

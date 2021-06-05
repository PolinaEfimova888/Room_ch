package com.example.room_ch;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class SimpleAdapter {
    SimpleCursorAdapter adapter;
    Context c;
    Activity activity;

    SimpleAdapter(Context context, Activity MainActivity){
        this.c = context;
        this.activity = MainActivity;
    }

    SimpleCursorAdapter productsAdapter(Cursor cursor) {
        adapter =
                new SimpleCursorAdapter(c, R.layout.item, cursor, cursor.getColumnNames(), new int[]{
                        R.id._id, R.id.product_name, R.id.count, R.id.category_id}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        return adapter;
    }

    SimpleCursorAdapter categoryProductsAdapter(Cursor cursor) {
        adapter =
                new SimpleCursorAdapter(c, R.layout.item, cursor, cursor.getColumnNames(), new int[]{
                        R.id._id, R.id.product_name, R.id.count, R.id.category_id}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);

        return adapter;
    }

    SimpleCursorAdapter categoryAdapter(Cursor cursor) {
        adapter =
                new SimpleCursorAdapter(c, R.layout.item, cursor, cursor.getColumnNames(), new int[]{
                        R.id.sec_category_id, R.id.category_name}, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
        return adapter;
    }



}

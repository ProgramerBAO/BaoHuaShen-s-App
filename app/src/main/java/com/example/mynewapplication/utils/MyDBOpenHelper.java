package com.example.mynewapplication.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;


/**
 * @author 沈宝铧
 * @date 2020/5/28
 */

public class MyDBOpenHelper extends SQLiteOpenHelper {

    private Context mContext;

    public MyDBOpenHelper(@Nullable Context context,
                          @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory,
                          int version) {
        //super(上下文, 数据库的名字, 不知道 一般写null, 版本);
        super(context, name, factory, version);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /**
         * 创建一个表
         * 创建表的代码可以写在这里
         */
        String sql = "create table users(id integer primary key autoincrement,"
                + "account text,"
                + "password text)";
        db.execSQL(sql);
        Toast.makeText(mContext, "数据表已创建成功！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //在此处增删改查

    }
}

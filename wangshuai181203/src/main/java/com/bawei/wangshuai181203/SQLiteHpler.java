package com.bawei.wangshuai181203;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHpler extends SQLiteOpenHelper {


    public SQLiteHpler(Context context) {
        super(context, "bw.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ws(int Integer primary key autoincrement,item_view text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

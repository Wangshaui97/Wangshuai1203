package com.bawei.wangshuai181203;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Dao {

    private static Dao intance;
    private SQLiteDatabase database;

    public Dao(Context context){
        SQLiteHpler sqLiteHpler = new SQLiteHpler(context);
        database = sqLiteHpler.getReadableDatabase();

    }

    public static Dao getIntance(Context context){

        if(intance ==null){
            return new Dao(context);
        }
        return intance;
    }

    public ArrayList<String> query(){
        Cursor cursor = database.rawQuery("select * from ws",null);
        ArrayList<String> mitem = new ArrayList<>();
        while(cursor.moveToNext()){
            String item_view = cursor.getString(cursor.getColumnIndex("item_view"));
            mitem.add(item_view);
        }
        return mitem;
    }

//    public void add(ArrayList<String> mlist) {
//        for(int i =0;i<mlist.size();i++){
//            String item_view = mlist.get(i);
//            database.execSQL("insert into ws(item_view) values(?)",new String[]{item_view});
//        }
//    }

    public void del() {
        database.delete("ws",null,null);
    }

    public void add(String string) {
        database.execSQL("insert into ws(item_view) values(?)",new String[]{string});
    }
}

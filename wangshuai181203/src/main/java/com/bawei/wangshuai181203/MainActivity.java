//package com.bawei.wangshuai181203;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MainActivity extends AppCompatActivity {
//
//    private Button putin,del;
//    private WeekgroupView weekgroupView,fl_hot;
//    private ArrayList<String> mlist = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        putin = findViewById(R.id.putin);
//        del = findViewById(R.id.del);
//        weekgroupView = findViewById(R.id.weekgroupview);
//
//        putin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = "数据";
//                mlist.add(s);
//
//                Dao.getIntance(MainActivity.this).add(mlist);
//
//                weekgroupView.setList(mlist);
//
//            }
//        });
//
//        ArrayList<String> query = Dao.getIntance(MainActivity.this).query();
//
//        weekgroupView.setList(query);
//
//        del.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                weekgroupView.removeAllViews();
//                Dao.getIntance(MainActivity.this).del();
//                ArrayList<String> query = Dao.getIntance(MainActivity.this).query();
//                weekgroupView.setList(query);
//            }
//        });
//           init();
//    }
//
//    private void init(){
//        fl_hot = findViewById(R.id.weekgroupview_rm);
//
////        TitleBarView title = findViewById(R.id.title);
////        title.setButtonClickListener(new TitleBarView.OnBuutonClickListener() {
////            @Override
////            public void onButtonClick(String str) {
////                TextView tv = new TextView(MainActivity.this);
////                tv.setText(str);
////                tv.setBackgroundResource(R.drawable.edit_bg);
////                weekgroupView.addView(tv);
////            }
////        });
//
//        for(int i = 0; i < 15; i++){
//            TextView tv = new TextView(MainActivity.this);
//            tv.setText("热门" + i);
//            tv.setBackgroundResource(R.drawable.edit_bg);
//            fl_hot.addView(tv);
//        }
//    }
//}

package com.bawei.wangshuai181203.weektest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.bawei.wangshuai181203.Dao;
import com.bawei.wangshuai181203.R;

public class WeekTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_test);

        init();
    }

    private void init(){
        final WeekFlowLayout fl_search = findViewById(R.id.fl_search);
        WeekFlowLayout fl_hot = findViewById(R.id.fl_hot);

        final TitleBarView title = findViewById(R.id.title);
        final TextView  edit_title= title.findViewById(R.id.edit_title);
        title.setButtonClickListener(new TitleBarView.OnBuutonClickListener() {
            @Override
            public void onButtonClick(String str) {
                TextView tv = new TextView(WeekTestActivity.this);
                tv.setText(str);
                tv.setBackgroundResource(R.drawable.edit_bg);
                fl_search.addView(tv);

                Dao.getIntance(WeekTestActivity.this).add(edit_title.getText().toString());
            }
        });

        for(int i = 0; i < 15; i++){
            TextView tv = new TextView(WeekTestActivity.this);
            tv.setText("热门" + i);
            tv.setBackgroundResource(R.drawable.edit_bg);
            fl_hot.addView(tv);
        }
    }
}

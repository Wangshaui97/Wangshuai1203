package com.bawei.wangshuai181203;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class WeekgroupView extends LinearLayout {

    //设置布局的最大长度，根据长度来进行换行
    int MAXSIZE = 20;


    private Context mcontext;
    private ArrayList<String> mlist = new ArrayList<>();


    public WeekgroupView(Context context) {
        super(context);
        mcontext = context;
        init();
    }

    public WeekgroupView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mcontext = context;
        init();
    }

    private void init() {
        //设置外层的LinearLayout 为垂直
        setOrientation(VERTICAL);
    }
    public void setList(ArrayList<String> mlist) {
        this.mlist =mlist;
        onShowData();
    }

    private void onShowData() {
        //每次重画之前进行清空
        removeAllViews();
        //添加横向布局
        LinearLayout linearLayout_h = (LinearLayout) View.inflate(mcontext, R.layout.week_heng, null);

        addView(linearLayout_h);

        int len = 0;
        for (int i = 0; i < mlist.size(); i++) {
            String str = mlist.get(i);

            len += str.length();

            if (len > MAXSIZE) {
                linearLayout_h = (LinearLayout) View.inflate(mcontext, R.layout.week_heng, null);

                addView(linearLayout_h);

                len = str.length();

            }


            View view = View.inflate(mcontext, R.layout.week_item, null);
            TextView textView =view.findViewById(R.id.item_view);
            textView.setText(str);
            linearLayout_h.addView(view);

            LinearLayout.LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.weight=1;
            view.setLayoutParams(layoutParams);

            final int index = i;
            view.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mcontext,"点击了"+ mlist.get(index),Toast.LENGTH_SHORT).show();
                }
            });

        }

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


    }


}

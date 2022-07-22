package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chapter03.utils.DateUtil;

public class ActivityButtonClick extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private TextView tv_btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click);

        // 写法一 标准内部类写法
        Button btn_single_click = findViewById(R.id.btn_single_click);
        tv_btn_result = findViewById(R.id.tv_btn_result);
        btn_single_click.setOnClickListener(new MyOnClickListener(tv_btn_result));

        // 写法二 把当前 Activity 类实现 Click 接口进行调用
        Button btn_single_public = findViewById(R.id.btn_single_public);
        btn_single_public.setOnClickListener(this);

        // 写法二 把当前 Activity 类实现 Long Click 接口进行调用
        Button btn_long_click = findViewById(R.id.btn_long_click);
        btn_long_click.setOnLongClickListener(this); // 实现长按点击
    }

    @Override // 单击事件
    public void onClick(View view) { // 写法二的接口实现

        if(view.getId() == R.id.btn_single_public) {

            String result = String.format("%s 您当前点击了 %s", DateUtil.getNowTime(), ((Button)view).getText());
            this.tv_btn_result.setText(result);
        }
    }

    @Override // 长按事件
    public boolean onLongClick(View view) {

        if(view.getId() == R.id.btn_long_click) {

            String result = String.format("%s 您当前长按点击了 %s", DateUtil.getNowTime(), ((Button)view).getText());
            this.tv_btn_result.setText(result);
            return true;
        } else {

            return false;
        }

    }

    // 一个实现了 View.OnClickListener 接口的类 写法一的标准内部类
    static class MyOnClickListener implements View.OnClickListener {

        private final TextView tv_btn_result;

        public MyOnClickListener(TextView tv_btn_result) {

            this.tv_btn_result = tv_btn_result;
        }

        @Override
        public void onClick(View view) {
            String result = String.format("%s 您当前点击了 %s", DateUtil.getNowTime(), ((Button)view).getText());
            this.tv_btn_result.setText(result);
        }
    }
}
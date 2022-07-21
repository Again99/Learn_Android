package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTextColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);

        // 获取控件
        TextView tv = findViewById(R.id.tv_hello);
        tv.setTextSize(30);
        tv.setTextColor(Color.GREEN); // 使用 Color类定义颜色

        // 获取控件
        TextView tv2 = findViewById(R.id.tv_hello2);
        tv2.setTextSize(30);
        tv2.setTextColor(0xff0000ff); // 使用 十六进制定义颜色
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 设置启动的 activity 布局文件
        setContentView(R.layout.activity_main);

        // 获取 TextView 控件
        TextView tv = findViewById(R.id.tv);
        tv.setText("你好， 我的世界！");

        // 获取 Button 控件
        Button button = findViewById(R.id.button); // 查找 button
        button.setOnClickListener(new View.OnClickListener() { // 构建 click 事件匿名类和方法
            @Override
            public void onClick(View view) {
                // 跳转 Activity
                Intent intent = new Intent(); // 建立意图
                intent.setClass(MainActivity.this, MainActivity2.class); // 设置意图跳转的class
                startActivity(intent); // 执行意图
            }
        });
    }
}
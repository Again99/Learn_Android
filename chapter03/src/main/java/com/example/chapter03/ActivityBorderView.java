package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chapter03.utils.Utils;

public class ActivityBorderView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_border_view);

        // 获取控件
        TextView tv_code = findViewById(R.id.tv_code_set);

        // 获取布局宽高参数
        ViewGroup.LayoutParams params = tv_code.getLayoutParams();
        params.width = Utils.dp2px(this, 300); // 设置宽度
        tv_code.setLayoutParams(params);
    }
}
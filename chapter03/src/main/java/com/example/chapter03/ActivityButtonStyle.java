package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chapter03.utils.DateUtil;

public class ActivityButtonStyle extends AppCompatActivity {

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_style);

        tv_result = findViewById(R.id.tv_result);
    }

    public void doClick(View view) {
        String result = String.format("%s 您当前点击了 %s", DateUtil.getNowTime(), ((Button)view).getText());
        this.tv_result.setText(result);
    }
}
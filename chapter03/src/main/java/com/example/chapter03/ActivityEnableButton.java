package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.chapter03.utils.DateUtil;

public class ActivityEnableButton extends AppCompatActivity implements View.OnClickListener {

    private Button btn_enable;
    private Button btn_unenable;
    private Button btn_enable_test;
    private TextView tv_enable_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enable_button);

        btn_enable = findViewById(R.id.btn_enable);
        btn_unenable = findViewById(R.id.btn_unenable);
        btn_enable_test = findViewById(R.id.btn_enable_test);
        tv_enable_test = findViewById(R.id.tv_enable_test);

        btn_enable.setOnClickListener(this);
        btn_unenable.setOnClickListener(this);
        btn_enable_test.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_enable:
                btn_enable_test.setEnabled(true);
                break;

            case R.id.btn_unenable:
                btn_enable_test.setEnabled(false);
                break;

            case R.id.btn_enable_test:
                String result = String.format("%s 您当前点击了 %s", DateUtil.getNowTime(), ((Button)view).getText());
                tv_enable_test.setText(result);
                break;
        }
    }
}
package com.example.yuekao.accountbook;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yuekao.R;

/**
 * @programName: AboutUsActivity.java
 * @programFunction: About Us page
 * @createDate: 2023/12/03
 * @author: 王悦荫
 * @version:V1.0
 */
public class AboutUsActivity extends AppCompatActivity {
    private TextView tvAboutUs;
    private TextView tvIntroduce;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
    }
}


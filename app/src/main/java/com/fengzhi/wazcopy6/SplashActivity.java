package com.fengzhi.wazcopy6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fengzhi.wazcopy6.contract.SplashContract;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public void jumpToMain() {

    }
}

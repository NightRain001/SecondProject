package com.example.yin.testforgit;

import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private static final String TAG = "MainActivityaaasdaaaaaaaaaaaaaaaaaa";
    @Override
    public Looper getMainLooper() {
        return super.getMainLooper();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

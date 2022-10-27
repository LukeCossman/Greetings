package com.hfad.greetings_lc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This program allows the user to select a language
 * and see that language's translation for "Hello"
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
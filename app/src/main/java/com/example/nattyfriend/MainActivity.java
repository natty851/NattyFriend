package com.example.nattyfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Add Fragment Activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.contentMainFragment,new MainFragment()).commit();
        }



    }   //Main Method

}   //Main Class

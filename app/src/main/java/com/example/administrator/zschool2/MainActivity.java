package com.example.administrator.zschool2;

import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FragmentManager fm;
        fm = getSupportFragmentManager();
        g501 f = new g501();
        fm.beginTransaction().replace(R.id.mainfame,f).addToBackStack(null).commit();



    }


}

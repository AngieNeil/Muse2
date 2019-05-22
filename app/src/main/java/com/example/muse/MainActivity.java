package com.example.muse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnFace;
    private Button mBtnVoice;
    private Button mBtnPulse;
    private Button mBtnWeather;
    private Button mBtnScene;
    private Button mBtnOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnFace=(Button)findViewById(R.id.recommend_1);
        mBtnFace.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,FaceActivity.class);
                startActivity(intent);
            }
        });
        mBtnVoice=(Button)findViewById(R.id.recommend_2);
        mBtnVoice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,VoiceActivity.class);
                startActivity(intent);
            }
        });
        mBtnPulse=(Button)findViewById(R.id.recommend_3);
        mBtnPulse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,PulseActivity.class);
                startActivity(intent);
            }
        });
        mBtnWeather=(Button)findViewById(R.id.recommend_4);
        mBtnWeather.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,WeatherActivity.class);
                startActivity(intent);
            }
        });
        mBtnScene=(Button)findViewById(R.id.recommend_5);
        mBtnScene.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,SceneActivity.class);
                startActivity(intent);
            }
        });
        mBtnOthers=(Button)findViewById(R.id.recommend_6);
        mBtnOthers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,OthersActivity.class);
                startActivity(intent);
            }
        });
    }
}

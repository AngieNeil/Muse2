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
        mBtnFace = (Button) findViewById(R.id.recommend_1);
        mBtnVoice = (Button) findViewById(R.id.recommend_2);
        mBtnPulse = (Button) findViewById(R.id.recommend_3);
        mBtnWeather = (Button) findViewById(R.id.recommend_4);
        mBtnScene = (Button) findViewById(R.id.recommend_5);
        mBtnOthers = (Button) findViewById(R.id.recommend_6);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick=new OnClick();
        mBtnFace.setOnClickListener(onClick);
        mBtnVoice.setOnClickListener(onClick);
        mBtnPulse.setOnClickListener(onClick);
        mBtnWeather.setOnClickListener(onClick);
        mBtnScene.setOnClickListener(onClick);
        mBtnOthers.setOnClickListener(onClick);
        return ;
    }

    private  class  OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.recommend_1:
                    intent = new Intent(MainActivity.this, FaceActivity.class);
                    break;
                case R.id.recommend_2:
                    intent = new Intent(MainActivity.this, VoiceActivity.class);
                    break;
                case R.id.recommend_3:
                    intent = new Intent(MainActivity.this, PulseActivity.class);
                    break;
                case R.id.recommend_4:
                    intent = new Intent(MainActivity.this, WeatherActivity.class);
                    break;
                case R.id.recommend_5:
                    intent = new Intent(MainActivity.this, SceneActivity.class);
                    break;
                case R.id.recommend_6:
                    intent = new Intent(MainActivity.this, OthersActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}//adsdsaad

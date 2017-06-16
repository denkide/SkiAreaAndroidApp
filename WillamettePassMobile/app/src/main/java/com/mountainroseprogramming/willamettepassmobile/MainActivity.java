package com.mountainroseprogramming.willamettepassmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Willamette Pass Mobile");
        setContentView(R.layout.activity_main);
    }

    public void doTrailMap(View view) {
        Intent intent = new Intent(this, TrailMapActivity.class);
        startActivity(intent);

    }

    public void doWeather(View view) {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);

    }

    public void doRoadConditions(View view) {
        Intent intent = new Intent(this, RoadConditionActivity.class);
        startActivity(intent);

    }

    public void doCurrentConditions(View view) {
        Intent intent = new Intent(this, CurrentConditionsActivity.class);
        startActivity(intent);

    }
}

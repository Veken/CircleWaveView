package com.fatchao.circleindicatorview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleIndicatorView mCircleIndicatorView;
    private WaveView waveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircleIndicatorView = (CircleIndicatorView) findViewById(R.id.circle_index_view);
        waveView = (WaveView) findViewById(R.id.wave_view);
        mCircleIndicatorView.goToPoint(100.00f);
        mCircleIndicatorView.setInSweepAngle(270);
        mCircleIndicatorView.setSweepAngle(360);


    }

}

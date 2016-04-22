package com.epicodus.concertaid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DisplayActivity extends AppCompatActivity {

    @Bind(R.id.tvDisplayZipCode) TextView mTVDisplayZipCode;
    @Bind(R.id.lvDisplayConcerts)
    ListView mLVDisplayConcerts;
    private String[] concerts = new String[] {"Concert1", "COncert2", "Concert3", "Concert4", "Concert5", "Conert6", "Concert7"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String userZip = intent.getStringExtra("userZip");
        mTVDisplayZipCode.setText("Concerts near " + userZip);

    }
}
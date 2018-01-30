package com.example.romain.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.*;
import static android.content.Intent.ACTION_DIAL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mAddress, mPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddress = findViewById(R.id.address);
        mPhone = findViewById(R.id.phone);

        mAddress.setOnClickListener(this);
        mPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.address: {
                startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(getString(R.string.geolocation))));
                break;
            }
            case R.id.phone: {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(getString(R.string.phoneCall))));
                break;
            }
        }
    }
}

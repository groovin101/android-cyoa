package com.groovin101.chooseyourownadventure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Toast.makeText(this, "username is: " + getUsernameFromIntent(), Toast.LENGTH_LONG).show();
    }

    private String getUsernameFromIntent() {
        Intent callingActivitysIntent = getIntent();
        return  callingActivitysIntent.getStringExtra("NAME") == null ? "Friend" : callingActivitysIntent.getStringExtra("NAME");
    }
}

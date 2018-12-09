package com.example.knight.dotmenucheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        TextView textView=  findViewById(R.id.textView);
        textView.setText(Objects.requireNonNull(getIntent().getExtras()).getString("key"));
    }
}

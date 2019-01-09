package com.example.knight.dotmenucheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        TextView textView=  findViewById(R.id.textView);
        textView.setText(Objects.requireNonNull(getIntent().getExtras()).getString("key"));

    }

    public void itemSelected(View view) {

        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBox:
                if (checked) {
                    Toast toast = Toast.makeText(this, "You will die soon", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    Toast toast = Toast.makeText(this, "Good Job", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    Toast toast = Toast.makeText(this, "Please eat more or go to Dinemore...", Toast.LENGTH_LONG);
                    toast.show();
                }
                break;
        }
    }
}

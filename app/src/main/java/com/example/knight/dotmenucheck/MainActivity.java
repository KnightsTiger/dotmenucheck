package com.example.knight.dotmenucheck;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(getApplicationContext(),"seekbar progress:", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"seekbar touch stopped!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.dot_menu, menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.item1:
            Toast toast = Toast.makeText(this, "We are Sri lanka", Toast.LENGTH_SHORT);
            toast.show();

                break;
            case R.id.item2:
                Toast toast1 = Toast.makeText(this, "email: abc@gmail.com", Toast.LENGTH_SHORT);
                toast1.show();
                break;

            case R.id.item3:
                Toast toast3 = Toast.makeText(this, "visit us abc.com", Toast.LENGTH_SHORT);
                toast3.show();
                break;
        }
         return true;


    }

    public void goToNextPage(View view) {
        EditText editText = findViewById(R.id.editText);
        Intent intent = new Intent(MainActivity.this,WelcomeScreen.class);
        intent.putExtra("key",editText.getText().toString());
        startActivity(intent);
    }

    public void showRatings(View view) {
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        String rate = String.valueOf(ratingBar.getRating());
        Toast toast = Toast.makeText(this,rate,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void seekMe(View view) {

    }
}

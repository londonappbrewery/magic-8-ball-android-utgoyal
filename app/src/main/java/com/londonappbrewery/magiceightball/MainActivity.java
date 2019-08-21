package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        Button askMe = findViewById(R.id.askMe);
        final ImageView magicBall = findViewById(R.id.imageView2);

        askMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Ask Me", "I have answers for you!");
                Random random = new Random();
                int number = random.nextInt(5);
                Log.d("Random Number", "number " +number);
                magicBall.setImageResource(ballArray[number]);
            }
        });


    }
}

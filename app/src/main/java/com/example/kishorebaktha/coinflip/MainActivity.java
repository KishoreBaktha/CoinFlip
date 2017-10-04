package com.example.kishorebaktha.coinflip;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button flip;
    ImageView img;
    Random r;
    int coinSide;//0-head 1-tail
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(Button)findViewById(R.id.button);
        img=(ImageView)findViewById(R.id.imageView);
        r=new Random();
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinSide = r.nextInt(2);
                if (coinSide == 0) {
                    img.setImageResource(R.drawable.heads);
                    Toast.makeText(getBaseContext(), "HEADS!!!!!!!", Toast.LENGTH_SHORT).show();
                } else
                {
                    img.setImageResource(R.drawable.tails);
                    Toast.makeText(getBaseContext(), "TAILS!!!!!!!", Toast.LENGTH_SHORT).show();
                }
                RotateAnimation rotateAnimation=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.1f,RotateAnimation.RELATIVE_TO_SELF,0.1f);
                  rotateAnimation.setDuration(100);
                img.startAnimation(rotateAnimation);
            }
        });
    }
}

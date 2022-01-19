package com.example.thebiblequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class ruleta extends AppCompatActivity{

    private Button btn2;
    TextView textView;
    ImageView ruleta, imgFlecha;
    Random r;
    int degree = 0, degree_old = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruleta);

        btn2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        ruleta = (ImageView) findViewById(R.id.imgRuleta);
        imgFlecha = (ImageView) findViewById(R.id.imageView6);
        r = new Random();

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree_old = degree % 360;
                degree = r.nextInt(360);
                RotateAnimation rotate = new RotateAnimation(degree_old, degree+ 720,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {

                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                ruleta.startAnimation(rotate);
            }
        });
    }

    private String currentNumber(int degrees) {
        String text = "";

        if (degrees >= (90) && degrees < (179)){
            text = "FARANDULA";

            intent = new Intent(ruleta.this,farandula.class);
            startActivity(intent);

        }
        if (degrees >= (180) && degrees < (269)){
            text = "DEPORTES";

            intent = new Intent(ruleta.this,deportes.class);
            startActivity(intent);
        }
        if (degrees >= (270) && degrees < (359)){
            text = "HISTORICAS";

            intent = new Intent(ruleta.this,historia.class);
            startActivity(intent);

        }
        else if (degrees >= (0)&& degrees < (89)){
            text = "BIBLICAS";

            intent = new Intent(ruleta.this,preguntas.class);
            startActivity(intent);

        }

        return text;
    }
}

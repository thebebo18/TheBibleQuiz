package com.example.thebiblequiz;

import android.animation.AnimatorSet;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class score extends AppCompatActivity {

    private long animationDuration = 10;
    private AnimatorSet animatorSet;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        score = getIntent().getExtras().getInt("score");

        TextView scoretv = (TextView) findViewById(R.id.puntuacion);
        scoretv.setText("" + score + "");

        animatorSet = new AnimatorSet();

        if (score >= 3) {

            imageView = findViewById(R.id.imgbien);
            Animation animationScale = AnimationUtils.loadAnimation(this, R.anim.scale);
            mediaPlayer = MediaPlayer.create(this, R.raw.fanfaria);
            mediaPlayer.start();
            imageView.startAnimation(animationScale);

        }

        Button btn1 = (Button) findViewById(R.id.btnVolver);
        Button btn2 = (Button) findViewById(R.id.btnCerrar);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(score.this, ruleta.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });
/*
        SQLiteDatabase newDB;
        Conection conn = new Conection(this, "DBandroid", null, 1);
        newDB = conn.getWritableDatabase();
        String consulta = "INSERT INTO marcador (puntuacion) VALUES (" + score + ") ";
        newDB.rawQuery(consulta, null);
*/
    }
}

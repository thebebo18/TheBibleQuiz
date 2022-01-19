package com.example.thebiblequiz;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class farandula extends AppCompatActivity {

    public List<quiz> preguntas = new ArrayList<quiz>();
    private TextView pregunta,resp1,resp2,resp3;
    private  Button btn1;
    private int i=0;
    private  int score =1;
    private  int opcion;
    int total;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);


        preguntas = GetPreguntas(this);

        Collections.shuffle(preguntas, new Random());
        total=4;

        btn1 = (Button) findViewById(R.id.BtnNext);

        pregunta = (TextView) findViewById(R.id.pregunt);
        resp1 = (TextView) findViewById(R.id.resp1);
        resp2 = (TextView) findViewById(R.id.resp2);
        resp3 = (TextView) findViewById(R.id.resp3);

        pregunta.setText(preguntas.get(i).getPregunta());
        resp1.setText(preguntas.get(i).getResp1());
        resp2.setText(preguntas.get(i).getResp2());
        resp3.setText(preguntas.get(i).getResp3());

        resp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion=1;
                resp1.setTextColor(Color.WHITE);
                resp2.setTextColor(Color.parseColor("#CBFFC107"));
                resp3.setTextColor(Color.parseColor("#CBFFC107"));
                if(opcion == preguntas.get(i).getOpcion()){
                    ++score;
                }
            }
        });

        resp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion=2;
                resp1.setTextColor(Color.parseColor("#CBFFC107"));
                resp2.setTextColor(Color.WHITE);
                resp3.setTextColor(Color.parseColor("#CBFFC107"));
                if(opcion == preguntas.get(i).getOpcion()){
                    ++score;
                }
            }
        });

        resp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opcion=3;
                resp1.setTextColor(Color.parseColor("#CBFFC107"));
                resp2.setTextColor(Color.parseColor("#CBFFC107"));
                resp3.setTextColor(Color.WHITE);
                //score = 0;
                if(opcion == preguntas.get(i).getOpcion()){
                    ++score;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++i;
                if (i<=total) {
                    pregunta.setText(preguntas.get(i).getPregunta());
                    resp1.setText(preguntas.get(i).getResp1());
                    resp2.setText(preguntas.get(i).getResp2());
                    resp3.setText(preguntas.get(i).getResp3());
                    resp1.setTextColor(Color.parseColor("#CBFFC107"));
                    resp2.setTextColor(Color.parseColor("#CBFFC107"));
                    resp3.setTextColor(Color.parseColor("#CBFFC107"));
                    setScore(score);
                }
                else{
                    Intent intent = new Intent(farandula.this, score.class);
                    intent.putExtra("score", score);
                    startActivity(intent);
                }
            }

        });

    }
    public List<quiz> GetPreguntas(final Context resolver) {

        List<quiz> preguntas = new ArrayList<quiz>();
        Cursor cursor = null;

        try {

            SQLiteDatabase newDB;
            Conection conn = new Conection(this,"DBandroid",null,1);
            newDB = conn.getWritableDatabase();

            String consulta ="SELECT * FROM quiz2";

            cursor = newDB.rawQuery(consulta, null);
            try
            {
                while (cursor.moveToNext())
                    preguntas.add(new quiz
                            (
                                    cursor.getInt(0),
                                    cursor.getString(1),
                                    cursor.getString(2),
                                    cursor.getString(3),
                                    cursor.getString(4),
                                    cursor.getInt(5),
                                    cursor.getInt(6)
                            ));
            }
            finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        catch (Exception e)
        {
        }
        return preguntas;
    }

    public void setScore(int score){
        Cursor cursor = null;

        try {

            SQLiteDatabase newDB;
            Conection conn = new Conection(this,"DBandroid",null,1);
            newDB = conn.getWritableDatabase();

            String consulta ="insert into marcador(Score) values" +"('"+score+"')";
            ContentValues values = new ContentValues();
            values.put("score",score);
            newDB.execSQL(consulta);
        }
        catch (Exception e)
        {
        }
    }

}



package com.example.thebiblequiz;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btnRegistrar;
    private TextView twScore;
    public List<quiz> preguntas = new ArrayList<quiz>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        twScore = (TextView) findViewById(R.id.tvscore);
        twScore.setText("" + GetScore() + "");

        btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ruleta.class);
                startActivity(intent);

            }
        });
    }

    public int GetScore() {

        Cursor cursor = null;// = null;
        int totalScore = 0;
        try {
            SQLiteDatabase newDB;
            Conection conn = new Conection(this, "DBandroid", null, 1);
            newDB = conn.getWritableDatabase();

            String consulta = "SELECT SUM(Score) FROM marcador";
            cursor = newDB.rawQuery(consulta, null);
            try {
                cursor.moveToNext();
                totalScore = +cursor.getInt(1);

            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception e) {
        }
        return totalScore;
    }
}

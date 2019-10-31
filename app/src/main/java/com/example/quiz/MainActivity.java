package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private int q;
    private TextView tv;
    private String[] questions, answers;
    private Toast t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        q = -1;
        questions = getResources().getStringArray(R.array.questions);
        answers = getResources().getStringArray(R.array.answers);
        tv = (TextView) findViewById(R.id.textView);
        refresh();
    }
    public void refresh() {
        t.show();
        if (q == questions.length) {
            q = 0;
        } else q++;
        tv.setText(questions[q]);
    }
    public void atrue(View view) {
        if (answers[q].equals("true")) {
            t.setText("Correct!");
        } else {
            t.setText("Incorrect!");
        }
        refresh();
    }
    public void afalse(View view) {
        if (answers[q].equals("false")) {
            t.setText("Correct!");
        } else {
            t.setText("Incorrect!");
        }
        refresh();
    }
    /*public void time(View view) {
        Button b = (Button) view;
        Date d = new Date();
        b.setText(d.toString());
    }*/
}

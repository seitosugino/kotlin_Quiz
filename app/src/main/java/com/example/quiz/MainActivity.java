package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvCount;
    private TextView tvQuestion;
    private Button ansBtn1;
    private Button ansBtn2;
    private Button ansBtn3;
    private Button ansBtn4;
    private Button nextBtn;

    String quizData[][] = {
            // {"問題", "正解", "選択肢１", "選択肢２", "選択肢３"}
            {"問題A", "A1", "A2", "A3", "A4"},
            {"問題B", "B1", "B2", "B3", "B4"},
            {"問題C", "C1", "C2", "C3", "C4"},
            {"問題D", "D1", "D2", "D3", "D4"},
            {"問題E", "E1", "E2", "E3", "E4"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getId();

        showQuiz();
    }

    public void getId() {
        tvCount = findViewById(R.id.tvCount);
        tvQuestion = findViewById(R.id.tvQuestion);
        ansBtn1 = findViewById(R.id.ansBtn1);
        ansBtn1 = findViewById(R.id.ansBtn2);
        ansBtn1 = findViewById(R.id.ansBtn3);
        ansBtn1 = findViewById(R.id.ansBtn4);
        nextBtn = findViewById(R.id.nextBtn);
    }

    public void showQuiz(){
        tvCount.setText("残り５問");
        tvQuestion.setText(quizData[0][0]);
        ansBtn1.setText(quizData[0][1]);
        ansBtn2.setText(quizData[0][2]);
        ansBtn3.setText(quizData[0][3]);
        ansBtn4.setText(quizData[0][4]);
    }
}
package com.codeclan.example.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private Button countButton;
    private TextView answerText;

    private WordCount wordCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = (EditText) findViewById(R.id.input_text);
        countButton = (Button) findViewById(R.id.count_button);
        answerText = (TextView) findViewById(R.id.answer_view);
    }

    public void onCountButtonClicked(View button) {

        String input = inputText.getText().toString();

        WordCount wordCount = new WordCount(input);
        int answer = answerToButtonClick.getWordCount();
        answerText.setText(answer);
    }
}

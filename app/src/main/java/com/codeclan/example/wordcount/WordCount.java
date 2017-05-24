package com.codeclan.example.wordcount;

import java.util.ArrayList;

/**
 * Created by user on 23/05/2017.
 */



public class WordCount {

    private String input;
    private String inputArray[];


    public WordCount(String input) {
        this.input = input;
    }


    public String getInput() {
        return this.input;
    }

    public int getWordCount() {

        inputArray = this.input.split(" ");
        int noOfWords = inputArray.length;
        return noOfWords;
    }
}

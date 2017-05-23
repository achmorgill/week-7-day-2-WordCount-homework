package com.codeclan.example.wordcount;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 23/05/2017.
 */
public class WordCountTest {
    @Test
    public void getTheInput() {
        WordCount wordCount = new WordCount("Hello there");
        assertEquals("Hello there",wordCount.getInput());
    }

    @Test
    public void inputWordCount() {
        WordCount wordCount = new WordCount("Hello there how are you");
        assertEquals(5, wordCount.getWordCount());

    }

}
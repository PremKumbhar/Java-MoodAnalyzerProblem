package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",result);

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
}

package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in sad mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD",result);
        }catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }

    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in any mood");
        try {
            String result = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",result);
        }catch (MoodAnalysisException exception){
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void givenNullMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL,exception.Type);
        }
    }

    @Test
    public void givenEmptyMessage_shouldThrowMoodAnalysisException(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
        try{
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException exception){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,exception.Type);
        }
    }
}

package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")){
            return "SAD";
        }
        else{
            return "HAPPY";
        }
    }
}

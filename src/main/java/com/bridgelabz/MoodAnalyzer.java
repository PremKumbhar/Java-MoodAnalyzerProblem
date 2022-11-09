package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        if (message == null){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL,"null mood is invalid..!");
        } else if (message.length() == 0) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY,"empty mood is invalid..!");
        } else if (message.contains("sad")) {
            return "SAD";
        }else {
            return "HAPPY";
        }
    }
}
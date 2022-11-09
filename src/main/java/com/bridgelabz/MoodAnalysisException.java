package com.bridgelabz;

public class MoodAnalysisException extends Exception {

    enum ExceptionType{
        EMPTY,
        NULL,
    }
    ExceptionType Type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        Type = type;
    }
}

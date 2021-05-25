package com.example.DesignPatterns.adapter;

public class NewLineFormatter implements LineFormattable {
    @Override
    public String formatText(String text) {
        String formattedText = text.replace(".", "\n");
        return formattedText;
    }
}
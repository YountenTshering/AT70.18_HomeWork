package com.example.DesignPatterns;

import com.example.DesignPatterns.adapter.CsvAdapterImpl;
import com.example.DesignPatterns.adapter.CsvFormattable;
import com.example.DesignPatterns.adapter.CsvFormatter;
import com.example.DesignPatterns.adapter.LineFormattable;
import com.example.DesignPatterns.adapter.NewLineFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		String testString = " Formating line 1. Formatting Line 2. Formatting Line 3.";
		LineFormattable newLineFormatter = new NewLineFormatter();
		String resultString = newLineFormatter.formatText(testString);
		System.out.println(resultString);

		CsvFormattable cvsFormatter = new CsvFormatter();
		LineFormattable csvAdapter = new CsvAdapterImpl(cvsFormatter);
		String resultCsvString = csvAdapter.formatText(testString);
		System.out.println(resultCsvString);

	}

}

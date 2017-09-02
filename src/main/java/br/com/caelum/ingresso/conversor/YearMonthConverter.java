package br.com.caelum.ingresso.conversor;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class YearMonthConverter implements Converter<String, YearMonth> {
	@Override
	public YearMonth convert(String text){
		return YearMonth.parse(text, DateTimeFormatter.ofPattern("MM/yyyy"));
	}

	@Override
	public JavaType getInputType(TypeFactory arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JavaType getOutputType(TypeFactory arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}

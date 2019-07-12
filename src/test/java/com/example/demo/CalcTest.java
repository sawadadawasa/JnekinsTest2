package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalcTest {
	
@Test
public void addに３と５を与えると８を返す () throws Exception{
	Calculator calc = new Calculator();
	int expected = 8;
	int actual = calc.add(3, 5);
	assertThat(actual, is(expected));
}

@Test
public void addに5と8を与えると13を返す () throws Exception{
	Calculator calc = new Calculator();
	int expected = 13;
	int actual = calc.add(5, 8);
	assertThat(actual, is(expected));
}

}

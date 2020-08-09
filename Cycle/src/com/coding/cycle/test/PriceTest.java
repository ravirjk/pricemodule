package com.coding.cycle.test;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import com.coding.cycle.PriceThread;

public class PriceTest {
	
	@Test
	public void calculateCyclePriceTest() {
		
		try {
			JSONObject  json = (JSONObject) new JSONParser().parse(new FileReader("./input/input_1.json"));
			Thread t = new Thread(new PriceThread(json));
			t.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

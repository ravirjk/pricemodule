package com.coding.cycle;

import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CalculatePrice {
	
	public static void main(String[] args) {
		
		ExecutorService executor = null;
		
		try {
			
			// initializing thread pool executor with 10 thread and LinkedBlockingQueue
			executor = Executors.newFixedThreadPool(10);
			
			// parsing json file which contains 1 input
			JSONObject  json = (JSONObject) new JSONParser().parse(new FileReader("./input/input_1.json"));
			executor.execute(new PriceThread(json));
			
			// parsing json file which contains 10 input
			// more inputs can be added to this input_10.json
			JSONArray  jsonArray = (JSONArray) new JSONParser().parse(new FileReader("./input/input_10.json"));
			for(int i = 0; i < json.size(); i++)
				executor.execute(new PriceThread((JSONObject)jsonArray.get(i)));
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(executor != null)
				executor.shutdown();
		}
	}
}

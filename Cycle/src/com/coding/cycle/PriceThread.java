package com.coding.cycle;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class PriceThread implements Runnable {
	
	private JSONObject json;
	
	public PriceThread(JSONObject json) {
		this.json = json;
	}

	@Override
	public void run() {
		
		try {
			// id field is used to indicate a cycle.
			int id = Integer.parseInt((String)json.get("id"));
			
			// year field is used to get the price in that year
			int year = Integer.parseInt((String)json.get("year"));
			
			// creating frame instance
			Frame frame = new Frame();
			frame.setMaterial((String) json.get("frame"));
			System.out.println("Price of the Frame for cycle id " + id + " : " + frame.getPrice(year));
			
			// creating seating instance
			Seating seat = new Seating();
			seat.setMaterial((String) json.get("seat"));
			System.out.println("Price of the Seat for cycle id " + id + " : " + seat.getPrice(year));
			
			// creating handle instance
			Handle handle = new Handle();
			HashMap<?, ?> handleMap = (HashMap<?, ?>) json.get("handle");
			handle.setStyle(Boolean.parseBoolean((String)handleMap.get("style")));
			handle.setDiscBrake(Boolean.parseBoolean((String)handleMap.get("discBrake")));
			handle.setBell(Boolean.parseBoolean((String)handleMap.get("bell")));
			System.out.println("Price of the Handle for cycle id " + id + " : " + handle.getPrice(year));
			
			// creating while instance
			Wheel wheel = new Wheel();
			HashMap<?, ?> wheelMap = (HashMap<?, ?>) json.get("wheel");
			wheel.setRim((String)wheelMap.get("rim"));
			wheel.setSpokes(Boolean.parseBoolean((String)wheelMap.get("spokes")));
			wheel.setTube(Boolean.parseBoolean((String)wheelMap.get("tube")));
			wheel.setTyre((String)wheelMap.get("tyre"));
			System.out.println("Price of the Wheel for cycle id " + id + " : " + wheel.getPrice(year));
			
			// creating chain instance
			Chain chain = new Chain();
			HashMap<?, ?> chainMap = (HashMap<?, ?>) json.get("chain");
			chain.setIsGear(Boolean.parseBoolean((String)chainMap.get("isGear")));
			chain.setGear(Integer.parseInt((String)chainMap.get("gear")));
			System.out.println("Price of the Chain for cycle id " + id + " : " + chain.getPrice(year));
			
			System.out.println("Total price for the cycle having id " + id + " : " + (frame.getPrice(year) + seat.getPrice(year) + handle.getPrice(year) + wheel.getPrice(year) + chain.getPrice(year)));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

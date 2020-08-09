package com.coding.cycle;

public class Seating implements Calculate {
	
	private String material;
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public double getPrice(int year) {
		
		double price = 0.0;
		
		switch(year) {
		
		case 2015:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 100.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 150.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 120.00;
			else
				price = 100.00; // any other material
			
			break;
			
		case 2016:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 110.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 160.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 130.00;
			else
				price = 110.00; // any other material
			
			break;
			
		case 2017:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 120.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 170.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 140.00;
			else
				price = 120.00; // any other material
			
			break;
			
		case 2018:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 130.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 180.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 150.00;
			else
				price = 130.00; // any other material
			
			break;
			
		case 2019:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 140.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 190.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 160.00;
			else
				price = 140.00; // any other material
			
			break;
			
		case 2020:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 150.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 200.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 170.00;
			else
				price = 150.00; // any other material
			
			break;
			
		case 2021:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 160.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 210.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 180.00;
			else
				price = 160.00; // any other material
			
			break;
			
		default:
			
			if(this.material.equals(Constants.SEAT_FIBER))
				price = 100.00;
			else if(this.material.equals(Constants.SEAT_FOAM))
				price = 150.00;
			else if(this.material.equals(Constants.SEAT_PLASTIC))
				price = 120.00;
			else
				price = 100.00; // any other material
			
			break;
			
		}
		
		return price;
	}

}

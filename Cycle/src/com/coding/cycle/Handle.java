package com.coding.cycle;

public class Handle implements Calculate {
	
	private boolean style;
	private boolean discBrake;
	private boolean bell;
	
	public boolean isStyle() {
		return style;
	}

	public void setStyle(boolean style) {
		this.style = style;
	}

	public boolean isDiscBrake() {
		return discBrake;
	}

	public void setDiscBrake(boolean discBrake) {
		this.discBrake = discBrake;
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	@Override
	public double getPrice(int year) {
		
		double style = 0.0;
		double discBrake = 0.0;
		double bell = 0.0;
		
		switch(year) {
		
		case 2015:
			
			if(this.style)
				style = 300.00;
			else
				style = 200.00;
				
			if(this.discBrake)
				discBrake = 350.00;
			else
				discBrake = 250.00;
			
			if(this.bell)
				bell = 100.00;
			else
				bell = 50.00;
			
			break;
			
		case 2016:
			
			if(this.style)
				style = 310.00;
			else
				style = 210.00;
				
			if(this.discBrake)
				discBrake = 360.00;
			else
				discBrake = 260.00;
			
			if(this.bell)
				bell = 110.00;
			else
				bell = 60.00;
			
			break;
			
		case 2017:
			
			if(this.style)
				style = 320.00;
			else
				style = 220.00;
				
			if(this.discBrake)
				discBrake = 370.00;
			else
				discBrake = 270.00;
			
			if(this.bell)
				bell = 120.00;
			else
				bell = 70.00;
			
			break;
			
		case 2018:
			
			if(this.style)
				style = 330.00;
			else
				style = 230.00;
				
			if(this.discBrake)
				discBrake = 380.00;
			else
				discBrake = 280.00;
			
			if(this.bell)
				bell = 130.00;
			else
				bell = 80.00;
			
			break;
			
		case 2019:
			
			if(this.style)
				style = 340.00;
			else
				style = 240.00;
				
			if(this.discBrake)
				discBrake = 390.00;
			else
				discBrake = 290.00;
			
			if(this.bell)
				bell = 140.00;
			else
				bell = 90.00;
			
			break;
			
		case 2020:
			
			if(this.style)
				style = 350.00;
			else
				style = 250.00;
				
			if(this.discBrake)
				discBrake = 400.00;
			else
				discBrake = 300.00;
			
			if(this.bell)
				bell = 150.00;
			else
				bell = 100.00;
			
			break;
			
		case 2021:
			
			if(this.style)
				style = 360.00;
			else
				style = 260.00;
				
			if(this.discBrake)
				discBrake = 410.00;
			else
				discBrake = 310.00;
			
			if(this.bell)
				bell = 160.00;
			else
				bell = 110.00;
			
			break;
			
		default:
			
			if(this.style)
				style = 300.00;
			else
				style = 200.00;
				
			if(this.discBrake)
				discBrake = 350.00;
			else
				discBrake = 250.00;
			
			if(this.bell)
				bell = 100.00;
			else
				bell = 50.00;
			
			break;
			
		}
		
		return style + discBrake + bell;
	}

}

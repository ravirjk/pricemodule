package com.coding.cycle;

public class Chain implements Calculate {
	
	private boolean isGear;
	private int gear;
	
	public boolean isGear() {
		return isGear;
	}

	public void setIsGear(boolean isGear) {
		this.isGear = isGear;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	@Override
	public double getPrice(int year) {
		
		double chain = 0.0;
		
		switch(year) {
		
		case 2015:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 700.00;
				else if(gear == 4)
					chain = 750.00;
				else if(gear == 5)
					chain = 800.00;
				else if(gear == 6)
					chain = 850.00;
				else
					chain = 600.00;
			} else {
				chain = 500.00;
			}
			
			break;
			
		case 2016:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 710.00;
				else if(gear == 4)
					chain = 760.00;
				else if(gear == 5)
					chain = 810.00;
				else if(gear == 6)
					chain = 860.00;
				else
					chain = 610.00;
			} else {
				chain = 510.00;
			}
			
			break;
			
		case 2017:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 720.00;
				else if(gear == 4)
					chain = 770.00;
				else if(gear == 5)
					chain = 820.00;
				else if(gear == 6)
					chain = 870.00;
				else
					chain = 620.00;
			} else {
				chain = 520.00;
			}
			
			break;
			
		case 2018:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 730.00;
				else if(gear == 4)
					chain = 780.00;
				else if(gear == 5)
					chain = 830.00;
				else if(gear == 6)
					chain = 880.00;
				else
					chain = 630.00;
			} else {
				chain = 530.00;
			}
			
			break;
			
		case 2019:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 740.00;
				else if(gear == 4)
					chain = 790.00;
				else if(gear == 5)
					chain = 840.00;
				else if(gear == 6)
					chain = 890.00;
				else
					chain = 640.00;
			} else {
				chain = 540.00;
			}
			
			break;
			
		case 2020:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 750.00;
				else if(gear == 4)
					chain = 800.00;
				else if(gear == 5)
					chain = 850.00;
				else if(gear == 6)
					chain = 900.00;
				else
					chain = 650.00;
			} else {
				chain = 550.00;
			}
			
			break;
			
		case 2021:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 760.00;
				else if(gear == 4)
					chain = 810.00;
				else if(gear == 5)
					chain = 860.00;
				else if(gear == 6)
					chain = 910.00;
				else
					chain = 660.00;
			} else {
				chain = 560.00;
			}
			
			break;
			
		default:
			
			if(this.isGear) {
				if(gear == 3)
					chain = 700.00;
				else if(gear == 4)
					chain = 750.00;
				else if(gear == 5)
					chain = 800.00;
				else if(gear == 6)
					chain = 850.00;
				else
					chain = 600.00;
			} else {
				chain = 500.00;
			}
			
			break;
			
		}
		
		return chain;
	}

}

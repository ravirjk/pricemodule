package com.coding.cycle;

public class Wheel implements Calculate {
	
	private String rim;
	private boolean spokes;
	private boolean tube;
	private String tyre;

	public String getRim() {
		return rim;
	}

	public void setRim(String rim) {
		this.rim = rim;
	}

	public boolean isSpokes() {
		return spokes;
	}

	public void setSpokes(boolean spokes) {
		this.spokes = spokes;
	}

	public boolean isTube() {
		return tube;
	}

	public void setTube(boolean tube) {
		this.tube = tube;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	@Override
	public double getPrice(int year) {
		
		double rim = 0.0;
		double spokes = 0.0;
		double tube = 0.0;
		double tyre = 0.0;
		
		switch(year) {
		
		case 2015:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 800.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 700.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 750.00;
			else
				rim = 650.00;
			
			if(this.spokes)
				spokes = 250.00;
			else
				spokes = 300.00;
			
			if(this.tube)
				tube = 500.00;
			else
				tube = 700.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 800.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 700.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 750.00;
			else
				tyre = 650.00;
				
			break;
			
		case 2016:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 810.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 710.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 760.00;
			else
				rim = 660.00;
			
			if(this.spokes)
				spokes = 260.00;
			else
				spokes = 310.00;
			
			if(this.tube)
				tube = 510.00;
			else
				tube = 710.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 810.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 710.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 760.00;
			else
				tyre = 660.00;
			
			break;
			
		case 2017:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 820.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 720.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 770.00;
			else
				rim = 670.00;
			
			if(this.spokes)
				spokes = 270.00;
			else
				spokes = 320.00;
			
			if(this.tube)
				tube = 520.00;
			else
				tube = 720.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 820.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 720.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 770.00;
			else
				tyre = 670.00;
			
			break;
			
		case 2018:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 830.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 730.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 780.00;
			else
				rim = 680.00;
			
			if(this.spokes)
				spokes = 280.00;
			else
				spokes = 330.00;
			
			if(this.tube)
				tube = 530.00;
			else
				tube = 730.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 830.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 730.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 780.00;
			else
				tyre = 680.00;
			
			break;
			
		case 2019:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 840.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 740.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 790.00;
			else
				rim = 690.00;
			
			if(this.spokes)
				spokes = 290.00;
			else
				spokes = 340.00;
			
			if(this.tube)
				tube = 540.00;
			else
				tube = 740.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 840.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 740.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 790.00;
			else
				tyre = 690.00;
			
			break;
			
		case 2020:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 850.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 750.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 800.00;
			else
				rim = 700.00;
			
			if(this.spokes)
				spokes = 300.00;
			else
				spokes = 350.00;
			
			if(this.tube)
				tube = 550.00;
			else
				tube = 750.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 850.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 750.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 800.00;
			else
				tyre = 700.00;
			
			break;
			
		case 2021:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 860.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 760.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 810.00;
			else
				rim = 710.00;
			
			if(this.spokes)
				spokes = 310.00;
			else
				spokes = 360.00;
			
			if(this.tube)
				tube = 560.00;
			else
				tube = 760.00;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 860.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 760.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 810.00;
			else
				tyre = 710.00;
			
			break;
			
		default:
			
			if(this.rim.equals(Constants.RIM_ALLOY))
				rim = 800.00;
			else if(this.rim.equals(Constants.RIM_ALUMINUM))
				rim = 700.00;
			else if(this.rim.equals(Constants.RIM_STEEL))
				rim = 750.00;
			else
				rim = 650.00;
			
			if(this.spokes)
				spokes = 250.00;
			else
				spokes = 300.00;
			
			if(this.tube)
				tube = 500;
			else
				tube = 700;
			
			if(this.tyre.equals(Constants.TYRE_MRF))
				tyre = 800.00;
			else if(this.tyre.equals(Constants.TYRE_HERO))
				tyre = 700.00;
			else if(this.tyre.equals(Constants.TYRE_CEAT))
				tyre = 750.00;
			else
				tyre = 650.00;
			
			break;
			
		}
		
		return rim + spokes + tube + tyre;
	}

}

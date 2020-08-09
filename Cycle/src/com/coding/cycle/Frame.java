package com.coding.cycle;

public class Frame implements Calculate {
	
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
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1200.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1250.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1220.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1150.00;
			else
				price = 1100.00; // any other material
			
			break;
			
		case 2016:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1210.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1260.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1230.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1160.00;
			else
				price = 1110.00; // any other material
			
			break;
			
		case 2017:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1220.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1270.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1240.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1170.00;
			else
				price = 1120.00; // any other material
			
			break;
			
		case 2018:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1230.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1280.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1250.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1180.00;
			else
				price = 1130.00; // any other material
			
			break;
			
		case 2019:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1240.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1290.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1260.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1190.00;
			else
				price = 1140.00; // any other material
			
			break;
			
		case 2020:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1250.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1300.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1270.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1200.00;
			else
				price = 1150.00; // any other material
			
			break;
			
		case 2021:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1260.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1310.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1280.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1210.00;
			else
				price = 1160.00; // any other material
			
			break;
			
		default:
			
			if(this.material.equals(Constants.FRAME_ALUMINUM))
				price = 1190.00;
			else if(this.material.equals(Constants.FRAME_STEEL))
				price = 1240.00;
			else if(this.material.equals(Constants.FRAME_TITANIUM))
				price = 1210.00;
			else if(this.material.equals(Constants.FRAME_FIBER))
				price = 1160.00;
			else
				price = 1100.00; // any other material
			
			break;
			
		}
		
		return price;
	}

}

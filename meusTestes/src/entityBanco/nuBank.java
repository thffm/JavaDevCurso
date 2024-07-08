package entityBanco;

import interfaceBanco.Tax;

public class nuBank implements Tax{

	
	
	@Override
	public double taxService(double value) {
		Double tax_value = 0.5;
		return value * tax_value;
	}

}

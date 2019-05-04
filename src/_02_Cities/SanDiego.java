package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}
	double taxes = population * growthRate; 
	@Override
	double getAnnualTaxes() {
		return taxes + 1000000;
	}
}

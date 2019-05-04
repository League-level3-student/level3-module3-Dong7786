package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}
	double taxes = population * growthRate;
	@Override
	double getAnnualTaxes() {
		return taxes * (growthRate/2);
	}
	
}

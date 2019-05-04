package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}
	double taxes = population * growthRate;
	@Override
	double getAnnualTaxes() {
		return taxes * (growthRate*2);
	}

}

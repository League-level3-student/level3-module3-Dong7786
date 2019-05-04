package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}
	double taxes = population * growthRate;
	@Override
	double getAnnualTaxes() {
		return taxes + population /2;
	}

}

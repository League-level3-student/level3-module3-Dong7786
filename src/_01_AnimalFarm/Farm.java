package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>() ;
	farm.add(new pig());
	farm.add(new cow());
	farm.add(new chicken());
	farm.add(new sheep());
	farm.add(new pig());
	farm.add(new cow());
	
	for(int i = 0; i < farm.size(); i ++) {
		farm.get(i).makeNoise();
		
	}
}

}

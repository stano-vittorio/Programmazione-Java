package it.univr.rent;

public class Bus extends AbstractModel {

	public Bus(String name, int pricePerDay) {
		super(name, pricePerDay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeDrivenWith(License license) {
		// TODO Auto-generated method stub
		return license == License.D;
	}

	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		return other instanceof Bus &&
				getName().equals(((Bus)other).getName()) &&
				pricePerDay() == ((Bus)other).pricePerDay();
	}
}

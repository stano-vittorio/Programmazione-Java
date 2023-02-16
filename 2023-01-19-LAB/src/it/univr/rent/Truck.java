package it.univr.rent;

public class Truck extends AbstractModel {

	public Truck(String name, int pricePerDay) {
		super(name, pricePerDay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeDrivenWith(License license) {
		// TODO Auto-generated method stub
		return license == License.C;
	}

	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		return other instanceof Truck &&
				getName().equals(((Truck)other).getName()) &&
				pricePerDay() == ((Truck)other).pricePerDay();
	}
}

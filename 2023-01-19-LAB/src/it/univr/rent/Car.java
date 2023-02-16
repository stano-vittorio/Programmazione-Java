package it.univr.rent;

public class Car extends AbstractModel {

	public Car(String name, int pricePerDay) {
		super(name, pricePerDay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeDrivenWith(License license) {
		// TODO Auto-generated method stub
		return license == License.B || license == License.C || license == License.D;
	}

	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		return other instanceof Car &&
				getName().equals(((Car)other).getName()) &&
				pricePerDay() == ((Car)other).pricePerDay();
	}
}

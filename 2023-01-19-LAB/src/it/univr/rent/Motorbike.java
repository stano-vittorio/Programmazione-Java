package it.univr.rent;

public class Motorbike extends AbstractModel {

	public Motorbike(String name, int pricePerDay) {
		super(name, pricePerDay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canBeDrivenWith(License license) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equals(Object other) {
		// TODO Auto-generated method stub
		return other instanceof Motorbike &&
				getName().equals(((Motorbike) other).getName()) &&
				pricePerDay() == ((Motorbike)other).pricePerDay();
	}
}

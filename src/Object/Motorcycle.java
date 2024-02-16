package Object;

import Validation.validation;

public class Motorcycle extends Vehicle
{
	private String motorType;
	private int helmet;
	public Motorcycle(String type, String brand, String name, String license, int topSpeed, int gasCap, int wheels,
			String motorType, int helmet) {
		super(type, brand, name, license, topSpeed, gasCap, wheels);
		this.motorType = motorType;
		this.helmet = helmet;
	}
	public String getMotorType() {
		return motorType;
	}
	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}
	public int getHelmet() {
		return helmet;
	}
	public void setHelmet(int helmet) {
		this.helmet = helmet;
	}
	@Override
	public void describe() {
		System.out.println("");
		System.out.println("-MOTORCYCLES SPESIFICATION-");
		System.out.println("");
		System.out.println("Brand: "+ getBrand());
		System.out.println("Name: "+getName());
		System.out.println("License Plate: "+getLicense());
		System.out.println("Type: "+getMotorType());
		System.out.println("Gas Capacity: "+getGasCap());
		System.out.println("Top Speed: "+getTopSpeed());
		System.out.println("Wheels: "+getWheels());
		System.out.println("Helmet: "+getHelmet());
		System.out.println(getName()+" is standing!");
		int price=validation.integerValidation(10000,250000,"Input Price per Helmet");
		System.out.println("Total Price: "+price*getHelmet());
	}
	
	
}

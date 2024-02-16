package Object;

public class Car extends Vehicle
{
	private String carType;
	private int eSystem;
	
	
	public Car(String type, String brand, String name, String license, int topSpeed, int gasCap, int wheels,
			String carType, int eSystem) {
		super(type, brand, name, license, topSpeed, gasCap, wheels);
		this.carType = carType;
		this.eSystem = eSystem;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int geteSystem() {
		return eSystem;
	}

	public void seteSystem(int eSystem) {
		this.eSystem = eSystem;
	}

	@Override
	public void describe() {
		System.out.println("");
		System.out.println("-CAR SPESIFICATION-");
		System.out.println("");
		System.out.println("Brand: "+ getBrand());
		System.out.println("Name: "+getName());
		System.out.println("License Plate: "+getLicense());
		System.out.println("Type: "+getCarType());
		System.out.println("Gas Capacity: "+getGasCap());
		System.out.println("Top Speed: "+getTopSpeed());
		System.out.println("Wheels: "+getWheels());
		System.out.println("Entertainment System: "+geteSystem());
		System.out.println("Turning on entertainment system...");
		if(carType.equals("Supercar"))
		{
			System.out.println("Boosting!");
		}
	}

	

}

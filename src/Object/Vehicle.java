package Object;

public abstract class Vehicle 
{
	private String type;
	private String brand;
	private String name;
	private String license;
	private int topSpeed;
	private int gasCap;
	private int wheels;
	
	

	public Vehicle(String type, String brand, String name, String license, int topSpeed, int gasCap, int wheels) {
		super();
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getGasCap() {
		return gasCap;
	}

	public void setGasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	
	public abstract void describe();

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}

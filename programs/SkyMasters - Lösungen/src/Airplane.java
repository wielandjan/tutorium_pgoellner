
public class Airplane extends FlyingMachine {
	private String name;
	private double maxSpeed;
	private double maxAltitude;
	private double price;
	
	public Airplane(String name, double maxSpeed, double maxAltitude, double price) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.maxAltitude = maxAltitude;
		this.price = price;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public double getMaxAltitude() {
		return maxAltitude;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name;
	}
}

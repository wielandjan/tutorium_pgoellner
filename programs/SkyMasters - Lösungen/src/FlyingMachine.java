
public class FlyingMachine {
	private String name;
	private double maxSpeed;
	private double maxAltitude;
	private double price;

	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxAltitude(double maxAltitude) {
		this.maxAltitude = maxAltitude;
	}
	
	public double getMaxAltitude() {
		return maxAltitude;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return name;
	}
}

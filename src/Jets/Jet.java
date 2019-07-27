package Jets;

public abstract class Jet {

	private String model;
	private int range;
	private double speed;
	private long price;
	
	
	public Jet(String model, int range, double speed, long price) {
		super();
		this.model = model;
		this.range = range;
		this.speed = speed;
		this.price = price;
	}
	public void fly() {
	System.out.print(range/speed);
	System.out.print(": amount of time(hrs) the jet can fly until it runs out of fuel. \n");
	}
	public double getSpeedInMach() {
		
		
		return 0.0;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the range
	 */
	public int getRange() {
		return range;
	}
	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}
	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [model=").append(model).append(", range=").append(range).append(", speed=").append(speed)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}
	
	
}

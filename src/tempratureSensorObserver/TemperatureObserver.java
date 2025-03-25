package tempratureSensorObserver;

public class TemperatureObserver implements DisplayDevice {

	private double temperature;

	@Override
	public void update(int temperature) {
		this.temperature = temperature;
	}
	
}
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
	}
	public void measurementChanged(){
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
	public float getTemparature(){
		return this.temperature;
	}
	public float getHumidity(){
		return this.humidity;
	}
	public float getPressure(){
		return this.pressure;
	}
}

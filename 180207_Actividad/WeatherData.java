import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {
	
	float temperatura;
	float humidity;
	float pressure;

	public WeatherData(float temperature, float humidity, float pressure){
		this.temperatura = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		System.out.printf("La Temperatura es "+ temperature + " ,la humedad es " +  humidity + " y la presion es " + pressure);
	}
	
	
	public float getTemp(){
		return this.temperatura;
	}
	
	public float getHum(){
		return this.humidity;
	}
	public float getPress(){
		
		return this.pressure;
		
	}
	
	public float setTemp(float t){
		return this.temperatura = t;
		
	}
	
	public float setHum(float h){
		return this.humidity = h;
		
	}
	
	public float setPress(float p){
		return this.pressure = p;
		
	}
	
	private void  MChanges(Observable obs){
		
		notifyObservers(obs);
	}
	
	
	
	

	

}

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	float temperatura;
	float humidity;
	float pressure;
	
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
	
	
	
	public void register(Observer displays) {
		// TODO Auto-generated method stub
		      observers.add(displays);
	}
	public void remove(Observer displays) {
		observers.remove(displays);
		// TODO Auto-generated method stub
		
	}
	public void notificar() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
	         observer.update(temperatura, humidity,pressure);
	      }
		
	}
	
	public void  MChanges(float temp, float hum, float press){
		this.humidity = temp;
		this.temperatura = temp;
		this.pressure = press;
		
		
		
		
	}
	
	
	

	

}

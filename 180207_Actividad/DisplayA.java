import java.util.Observable;
import java.util.Observer;

public class DisplayA implements Observer{
	
	private float temp=0;
	private float hum=0;
	private float pres=0;

	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if(obs instanceof WeatherData){
			
			 temp = ((WeatherData) obs).getTemp();
			 hum = ((WeatherData) obs).getHum();
			 pres = ((WeatherData) obs).getPress();
			 
			System.out.printf("\n"+"Nuevo Display: " + "\n" + "Temperature: "+ temp + "\n" + "Humidity: " +  hum + "\n"+ "Pressure: "+pres +"\n");
		}
		else
			System.out.println("Mismo Display");
	}
	
	public void mostrar(){
		System.out.print("Del dispositivo A: La temperatura es " + temp + ", la humedad es " + hum + ", la presion es " + hum );
	}
	
	

	
}

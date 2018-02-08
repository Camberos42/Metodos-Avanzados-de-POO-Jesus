
public class DisplayA implements Observer{
	
	private float temp=0;
	private float hum=0;
	private float pres=0;
	/*public DisplayA(WeatherData wd){
	      this.wd = wd;
	      this.wd.register(this);
	   }
*/
	@Override
	public void update(float temp, float hum, float pres) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.hum = hum;
		this.pres = pres;
	}
	
	public void mostrar(){
		System.out.print("Del dispositivo A: La temperatura es " + temp + ", la humedad es " + hum + ", la presion es " + hum );
	}
	
	

	
}

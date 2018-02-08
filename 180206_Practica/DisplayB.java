
public class DisplayB implements Observer{
	
	private float temp=0;
	private float hum=0;
	private float pres=0;

	@Override
	public void update(float temp, float hum, float pres) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.hum = hum;
		this.pres = pres;
		
	}
	
	public void mostrar(){
		
	}
	
	

}

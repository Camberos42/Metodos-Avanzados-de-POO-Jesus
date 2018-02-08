
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData c1 = new WeatherData();
		DisplayA da = new DisplayA();
		DisplayB db = new DisplayB();
		
		c1.setHum(10);
		c1.setTemp(10);
		c1.setPress(12);
		
		da.update(10, 12, 10);
		da.mostrar();
	}

}

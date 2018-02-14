
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData(30, 15, 25);
		DisplayA disA = new DisplayA();
		
		wd.addObserver(disA);
		
		wd.setTemp(12);
		wd.setHum(8);
		wd.setPress(35);
	}

}

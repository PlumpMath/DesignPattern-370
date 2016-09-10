package observer.pattern;

public class WeatherStation {
	public static void main (String args[]){
		WeatherData weatherData=new WeatherData();
		
//		CurrentConditionDisplay ccd=new CurrentConditionDisplay(weatherData);
		CurrentConditionDisplay ccd=new CurrentConditionDisplay();
		
		weatherData.registerObserver(ccd);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
	}
}

package observer.pattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	//private Subject weatherData;
	
//	public CurrentConditionDisplay(Subject weatherData){
//		//this.weatherData=weatherData;
//		//weatherData.registerObserver(this);  //register 
//	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condition: "+temperature+" F degrees and "+humidity+"% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity=humidity;
		this.temperature=temp;
		display();
	}
}

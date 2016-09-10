package observer.pattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	public ArrayList observers;
	public float temperature;
	public float humidity;
	public float pressure;
	
	public WeatherData(){
		observers=new ArrayList();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int index=observers.indexOf(observer);
		if(index>=0){
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size();i++){
			Observer o=(Observer) observers.get(i);
			o.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged(){
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementChanged();
	}

}

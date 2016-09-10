package compound.mvc.pattern;

public class HeartAdapter implements BeatModelInterface{
	HeartModelInterface heart;
	public HeartAdapter(HeartModelInterface heart){
		this.heart=heart;
	}
	@Override
	public void intialize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setBPM(int bmp) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return heart.getHeartRate();
	}
	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		heart.registerObserver(o);
	}
	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub
		heart.removeObserver(o);
	}
	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		heart.registerObserver(o);
	}
	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub
		heart.removeObserver(o);
	}
	
}

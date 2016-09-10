package compound.mvc.pattern;

public interface BeatModelInterface {
	void intialize();
	void on();
	void off();
	void setBPM(int bmp);
	int getBPM();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}

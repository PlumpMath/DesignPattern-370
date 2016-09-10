package compound.mvc.pattern;

public class BeatController implements ControllerInterface{
	BeatModelInterface model;
	DJView view;
	
	public BeatController(BeatModelInterface model){
		this.model=model;
		view=new DJView(this,model);
		view.creatView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.intialize();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		model.on();
		view.disableStartMenuItem();
		view.enableStopMenuItem();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		model.off();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
	}

	@Override
	public void increaseBPM() {
		// TODO Auto-generated method stub
		int bpm=model.getBPM();
		model.setBPM(bpm+1);
	}

	@Override
	public void decreaseBPM() {
		// TODO Auto-generated method stub
		int bpm=model.getBPM();
		model.setBPM(bpm-1);
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		model.setBPM(bpm);
	}
}

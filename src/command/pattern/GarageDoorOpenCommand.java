package command.pattern;

public class GarageDoorOpenCommand implements Command{
	GarageDoor door;
	public GarageDoorOpenCommand(GarageDoor door){
		this.door=door;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.down();
	}

}

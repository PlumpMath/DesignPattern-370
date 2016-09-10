package command.pattern;

public class RemoteControlTest {
	public static void main(String args[]){
		SimpleRemoteControl remote=new SimpleRemoteControl();
		Light light=new Light();
		LightOnCommand lightOn=new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor door=new GarageDoor();
		GarageDoorOpenCommand goc=new GarageDoorOpenCommand(door);
		remote.setCommand(goc);
		remote.buttonWasPressed();
	}
}

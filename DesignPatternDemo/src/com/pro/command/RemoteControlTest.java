package com.pro.command;

public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remoteControl = new SimpleRemoteControl();

		Light light = new Light();
		Stereo stereo = new Stereo();

		// change command dynamically
		remoteControl.setCommand(new LightOnCommand(light));
		remoteControl.buttonWasPressed();

		remoteControl.setCommand(new StereoOnWithCDCommand(stereo));
		remoteControl.buttonWasPressed();

		remoteControl.setCommand(new StereoOffCommand(stereo));
		remoteControl.buttonWasPressed();
	}
}

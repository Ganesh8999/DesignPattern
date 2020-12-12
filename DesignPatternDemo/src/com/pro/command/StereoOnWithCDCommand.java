package com.pro.command;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.stereoOn();
		stereo.setCD();
		stereo.setVolume(11);
	}
}

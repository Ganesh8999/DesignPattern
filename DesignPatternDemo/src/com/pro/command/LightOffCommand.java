package com.pro.command;



public class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff();
	}

}

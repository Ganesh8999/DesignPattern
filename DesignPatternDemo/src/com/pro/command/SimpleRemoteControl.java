package com.pro.command;

//A Simple remote control with one button 

public class SimpleRemoteControl {

	// Only one button
	Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {

		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();	
	}

}
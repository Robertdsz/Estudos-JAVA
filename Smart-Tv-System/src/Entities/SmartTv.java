package Entities;

public class SmartTv {
	
	public boolean status = false;
	public int channel = 1;
	public int volume = 25;
	
	public void turnOn() {
		status = true;
	}
	public void turnOff() {
		status = false;
	}
	
	public void increaseVolume() {
		volume++;
		System.out.println("Aumentando volume para: " + volume);
	}
	public void decreaseVolume() {
		volume--;
		System.out.println("Diminuindo volume para: " + volume);		
	}
	public void increaseChannel() {
		channel++;
}
	public void decreaseChannel() {
		channel--;
	}
	public void changeChannel(int newChannel) {
		channel = newChannel;
	}
}
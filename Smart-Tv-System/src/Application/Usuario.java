package Application;

import Entities.SmartTv;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Status da TV: " + smartTv.status);
		System.out.println("Canal: " + smartTv.channel);
		System.out.println("Volume: " + smartTv.volume);
		
		System.out.println();
		smartTv.turnOn();
		System.out.println("Novo Status TV -> TV ligada? " + smartTv.status);
		smartTv.turnOff();
		System.out.println("Novo Status TV -> TV ligada? " + smartTv.status);
		
		System.out.println();
		smartTv.increaseVolume();
		smartTv.decreaseVolume();
		smartTv.decreaseVolume();
		smartTv.decreaseVolume();
		
		smartTv.changeChannel(22);
		
		System.out.println();
		System.out.println("Volume Atual: " + smartTv.volume);
		System.out.println("Canal atual: " + smartTv.channel);
	}

}

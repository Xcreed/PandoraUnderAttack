package controller;

import java.time.LocalTime;

/**
 * Class for the time, extends from Thread
 * because the time is a running thread
 * throughout the game.
 * 
 * @author Randy
 *
 */

public class Time extends Thread {


	@Override
	public void run(){
		while(true){
			LocalTime time = LocalTime.now(); 
			//System.out.println(time);	
		}
		
	}
	
}

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

	/**
	 * Overwritten and void method to run the thread,
	 * it update the time constantly for game.
	 */
	@Override
	public void run(){
		while(true){
			LocalTime time = LocalTime.now(); 
			//start();
			//System.out.println(time);	
		}
	}
	
	/**
	 * Returns a time: hh:dd:mm:ss.000
	 * @return time
	 */
	public LocalTime getTime(){
		LocalTime time = LocalTime.now();
		return time;
	}
	
}

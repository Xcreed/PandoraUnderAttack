package controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class ServerWrite implements Runnable{
	Socket socket;
	String out;
	PrintWriter output;
	
	public ServerWrite(Socket socket){
		this.socket = socket;
		
	}
	
	public void thread(){
		Thread thread = new Thread();
		thread.start();
		try {
			output = new PrintWriter(socket.getOutputStream(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String Message) {
		// TODO Auto-generated method stub
		try{
			output.println(Message);
			output.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

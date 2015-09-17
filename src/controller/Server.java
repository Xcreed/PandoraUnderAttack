package controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Observer{
	public static void main(String[] args){
		Thread t = new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Server is running and listening");
				try {
					ServerSocket ss = new ServerSocket(7777);
					while(true){
						Socket s= ss.accept();
						DataInputStream dis = new DataInputStream(s.getInputStream());
						System.out.println("Received from client: "+dis.readUTF());
						dis.close();
						s.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		t.start();
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}


package view;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.Clan;
import controller.Client;


public class MainWindow {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
    
    public JFrame Window;
    public JPanel Pa;
    Menu MenuW;
    public boolean running;
    public boolean MenuWindow;
    public boolean GameLoop;
    public boolean AboutLoop;
    public Graphics g;    
    
    public MainWindow(){
        Controller();
    }
    
    public void Controller(){
        running = true;
        MenuWindow = true;
        MenuW = new Menu();
        
        Window = new JFrame("Pandora Server");
        Window.setSize(600, 600);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setLocationRelativeTo(null);
        Window.setVisible(true);
        
        MenuW.Menus();
        Window.add(MenuW.getGUI());
    }
    
    public static void main(String[] args) {
        new MainWindow();
    }
}


package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class About {
    
    private JPanel P;
    private JButton Back;
    private JLabel AboutLabel;
    private ImageIcon AboutImg = new ImageIcon("src/res/About.png");
    public boolean MenuWindow;
    public boolean AboutLoop;
    Menu MenuW = new Menu();
    
    Color myOrange = new Color(255,81,8);
    
    public void Abouts(){
        P = new JPanel();
        P.setBackground(Color.BLACK);
        P.setLayout(null);
        P.setVisible(true);
        
        Back = new JButton();
        
        
        Back = new JButton();
        Back.setBackground(myOrange);
        Back.setBorderPainted(false);
        Back.setBorder(null);
        Back.setOpaque(false);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuWindow = true;
                AboutLoop = false;
                MenuW.Menus();
                P = MenuW.P;
                
                
            }
        });
        Back.setFont(new java.awt.Font("Eras Bold ITC", 1, 30));
        Back.setText("Back");
        Back.setForeground(myOrange);
        Back.setBorderPainted(false);
        Back.setBorder(null);
        Back.setOpaque(false);
        P.add(Back);
        Back.setBounds(692,520,88,40);
        
        
        AboutLabel = new JLabel(AboutImg);
        P.add(AboutLabel);
        AboutLabel.setBounds(0,0,800,600);
        
        
    }
    public JComponent getGUI() {
        return P;
    }
}

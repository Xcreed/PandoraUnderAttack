
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu{
    
    
    public JPanel PanelServer;
    private JLabel TitleLabel;
    private JButton Exit; 
    
    Color myOrange = new Color(255,81,8);
    
    public void Menus(){
        PanelServer = new JPanel();
        PanelServer.setBackground(Color.GREEN);
        PanelServer.setLayout(null);
        PanelServer.setVisible(true);
        
        TitleLabel = new JLabel("PRUEBA");
        PanelServer.add(TitleLabel);
        TitleLabel.setBounds(150,0,450,250);
        
        Exit = new JButton();
        Exit.setBackground(myOrange);
        Exit.setBorderPainted(false);
        Exit.setBorder(null);
        Exit.setOpaque(false);
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Exit.setFont(new java.awt.Font("Eras Bold ITC", 1, 40));
        Exit.setText("Exit");
        Exit.setForeground(myOrange);
        Exit.setBorderPainted(false);
        Exit.setBorder(null);
        Exit.setOpaque(false);
        PanelServer.add(Exit);
        Exit.setBounds(400-44,429,88,47);
        
    }
    public JComponent getGUI() {
        return PanelServer;
    }
}

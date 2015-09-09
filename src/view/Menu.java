
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Menu{
    
    
    public JPanel P;
    private JLabel TitleLabel;
    private ImageIcon TitleImg = new ImageIcon("src/res/CrazyDuckHunt_2.png");
    private JButton Play; 
    private JButton About; 
    private JButton Exit; 
    public boolean GameLoop;
    public boolean AboutLoop;
    
    Color myOrange = new Color(255,81,8);
    
    public void Menus(){
        P = new JPanel();
        P.setBackground(Color.BLACK);
        P.setLayout(null);
        P.setVisible(true);
        
        TitleLabel = new JLabel(TitleImg);
        P.add(TitleLabel);
        TitleLabel.setBounds(150,0,450,250);
        
        
        Play = new JButton();
        Play.setBackground(myOrange);
        Play.setBorderPainted(false);
        Play.setBorder(null);
        Play.setOpaque(false);
        Play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                GameLoop = true;
                
                //System.out.println(GameLoop);
        }
        });
        Play.setFont(new java.awt.Font("Eras Bold ITC", 1, 40));
        Play.setText("Play");
        Play.setForeground(myOrange);
        Play.setBorderPainted(false);
        Play.setBorder(null);
        Play.setOpaque(false);
        P.add(Play);
        Play.setBounds(400-47,275,94,47);
        
        
        About = new JButton();
        About.setBackground(myOrange);
        About.setBorderPainted(false);
        About.setBorder(null);
        About.setOpaque(false);
        About.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                AboutLoop = true;
                System.out.println("AboutTrue");
        }
        });
        About.setFont(new java.awt.Font("Eras Bold ITC", 1, 40));
        About.setText("About");
        About.setForeground(myOrange);
        About.setBorderPainted(false);
        About.setBorder(null);
        About.setOpaque(false);
        P.add(About);
        About.setBounds(400-69,352,138,47);
        
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
        P.add(Exit);
        Exit.setBounds(400-44,429,88,47);
        
    }
    public JComponent getGUI() {
        return P;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;





import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.sql.*;

public class clientIcons extends JPanel {

public static String iconame="sooraj";    
          
        javax.swing.ImageIcon imgSys = new javax.swing.ImageIcon("Computer.png");
        javax.swing.JLabel sysIcon = new JLabel(imgSys,0);
        javax.swing.JLabel userName = new JLabel();
        javax.swing.JLabel systemName = new JLabel();
        javax.swing.GroupLayout gl1;
        
        ResultSet rst=null;   
        public  Connection MyCnnct=null;
            
        public MouseListener ms=new MouseListener() {

        public void mouseClicked(MouseEvent e) {
            iconame=systemName.getName();
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }
    };
        

public void setPC(String pc,String ip)
{
    systemName.setText(pc);   
    systemName.setName(ip);
}
public void setUser(String user)
{
    systemName.setText(user);
}
        
	public clientIcons()
	{
         
            
            setVisible(true);
          userName.setText("Available");
           userName.setSize(90, 25);
           
           systemName.setSize(90, 25);
       
        systemName.setText(FlagClass.SysName);
        
        setSize(190, 190);
        sysIcon.setBounds(0, 0, 80, 80);
        userName.setBounds(0, 100, 90, 25);
        systemName.setBounds(0, 80, 90, 20);
        gl1 = new javax.swing.GroupLayout(this);
        setLayout(gl1);
        add(sysIcon);
        add(userName);
        add(systemName);
        addMouseListener(ms);               
			
	}
	
	
}




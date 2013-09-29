/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;

/**
 *
 * @author Sooraj
 */


import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.sql.*;

public class clientSystems extends JPanel {
	
	public static JPanel tmpJPanel=new JPanel();
        //public JButton jb1 = new JButton("button");
        
        public JPanel pnlIcon =new JPanel();
        public static JPanel[] pnlSys;
	
        ResultSet rst=null;   
        public  Connection MyCnnct=null;
        
  //add icon
        
        
        
        
        
        //end add icon
        
        
	public clientSystems()
	{
        try {
            String driverName = "oracle.jdbc.driver.OracleDriver";
      Class.forName(driverName);
       String host="localhost";
          String dbName="XE";
          int port=1521;
          String oracleURL="jdbc:oracle:thin:@"+host+":"+port+":"+dbName;
          String username="SYSTEM";
          String password="password";
          MyCnnct = DriverManager.getConnection(oracleURL,username,password);
         setName("Client Systems");
         
         
         //icon
       
         //endicon
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
                  setVisible(true);
                  tmpJPanel.addContainerListener(watcher);
                  reload_icons();
        } catch (SQLException ex) {
            Logger.getLogger(clientSystems.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(clientSystems.class.getName()).log(Level.SEVERE, null, ex);
        }
            
	}
	
        
        
        public static void trackMessage()
        {
            
            JButton tmpBut=new JButton();
            
            tmpJPanel.add(tmpBut);
        }
        public ContainerListener watcher=new ContainerListener() {

        public void componentAdded(ContainerEvent e) {
           tmpJPanel.remove(0);
        }

        public void componentRemoved(ContainerEvent e) {

      
            if(FlagClass.conditions.equals("register"))
            {
                registeClient();
            }
            if(FlagClass.conditions.equals("reload"))
            {
                System.out.println("reload ");
                reload_icons();
            }
            FlagClass.conditions="null";
        }
    };
        public void registeClient()
        {
        try {
              
              
       
        
         java.sql.Statement stmt1 = MyCnnct.createStatement();
        java.sql.Statement stmt2=MyCnnct.createStatement();
        java.sql.Statement stmt3=MyCnnct.createStatement();
        ResultSet rslt1=null;
        ResultSet rslt2=null;
        ResultSet rslt3=null;
         
            
            
       //Connection con2;
            System.out.println(FlagClass.msg + "sooraj");
        
          if(FlagClass.msg.startsWith("Application"))
          {
              rslt1=stmt1.executeQuery("select id from cs_clientsystems where ip='"+FlagClass.Ip+"'");
             
              
                if(rslt1.next())
                {
                    rslt2=stmt2.executeQuery("update cs_clientsystems set status=1 where ip='"+FlagClass.Ip+"'"); 
                    System.out.println("update"); 
                    reload_icons();
                    System.out.println("Enter in if");
                    
                }
                else
                {
                System.out.println("Enetr in else");
             //       FlagClass.NumOfSys++;
               
                    rslt3=stmt3.executeQuery("insert into cs_clientsystems(id,ip,name,status,cust_id,port) values(client_seq.nextval,'"+FlagClass.Ip+"','"+FlagClass.SysName+"',1,0,'"+FlagClass.port+"')");
                    System.out.println("insert else");
                    reload_icons();
                }    
          }
        } catch (SQLException ex) {
            System.out.println("Enter in exception block");
            Logger.getLogger(clientSystems.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NullPointerException ne){
            
        System.out.println("Null pointer ");
        }
        }
        
        
        public void reload_icons()
        {
        try {
            FlagClass.NumOfSys = 0;
            java.sql.Statement st = MyCnnct.createStatement();
            ResultSet rst1 = null;
            rst1 = st.executeQuery("select name,cust_id from cs_clientsystems");
            while (rst1.next()) {
                FlagClass.SysName = rst1.getString("name");
                FlagClass.NumOfSys++;
                addIcon();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(clientSystems.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            
        }
	public void addIcon()
	{
         int i=FlagClass.NumOfSys;
        pnlSys=new JPanel[i];
        pnlSys[i-1]=new JPanel();
        
        
                javax.swing.JToggleButton jb1 = new javax.swing.JToggleButton();
        javax.swing.ImageIcon imgSys = new javax.swing.ImageIcon("Computer.png");
        javax.swing.JLabel jl1 = new JLabel(imgSys,0);
        javax.swing.JLabel jl2 = new JLabel();
        javax.swing.JLabel jl3 = new JLabel();
        JButton jb2 = new JButton();
       
         jl2.setSize(90, 25);
        jl3.setSize(90, 25);
  
        jb1.setSelected(false);
        jb1.setText("LogIn");
        jb1.setName("toggle");
        
        
        javax.swing.GroupLayout gl1 = new javax.swing.GroupLayout(pnlSys[i-1]);
        //javax.swing.GroupLayout gl1 = new javax.swing.GroupLayout(pnlIcon);
  
        
        pnlSys[i-1].setLayout(gl1);
        
        jb2.setText("LogIn");
        
       pnlSys[i-1].setSize(190, 190);
        //pnlIcon.setSize(190,190);
        
        jl1.setBounds(0, 0, 80, 80);
        jb1.setSize(90, 23);
        jb1.setBounds(85, 30, 90, 23);
        jb2.setBounds(85, 40, 90, 23);
        jl2.setBounds(0, 100, 90, 25);
        jl3.setBounds(0, 80, 90, 20);

        
      
        
          jl2.setText("aswin");
        
        jl3.setText(FlagClass.SysName);
        
        jl3.setName(FlagClass.SysName);
        /*
         pnlIcon.add(jl1);
        pnlIcon.add(jb1);
        pnlIcon.add(jl3);
        pnlIcon.add(jl2);
        int wids=((i-1)/3)*200;
       pnlIcon.setLocation(30+(((i-1)%3)*200), 30+wids);
       
         add(pnlIcon);
         
      */
         
           
        pnlSys[i-1].setLayout(gl1);
        
        
        pnlSys[i-1].add(jl1);
        pnlSys[i-1].add(jb1);
        pnlSys[i-1].add(jl3);
        pnlSys[i-1].add(jl2);
        int wids=((i-1)/3)*200;
        pnlSys[i-1].setLocation(30+(((i-1)%3)*200), 30+wids);
       
         add(pnlSys[i-1]);
      
         
         repaint();
       
			
	}
	
	

}


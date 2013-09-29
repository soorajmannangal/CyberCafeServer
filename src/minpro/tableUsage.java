/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;

/**
 *
 * @author Sooraj
 */

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class tableUsage extends JFrame
{
    JLabel select;
    DefaultTableModel model;
    JTable table;
    JScrollPane jsp;
    JButton remove;
    JButton cancel;
    
    public tableUsage()
    {
        setLayout(null);

        select=new JLabel("Select user");
        add(select);
        select.setBounds(70,30,100,20);

        

        remove=new JButton("Remove");
        add(remove);
        remove.setBounds(70,165,100,20);

        cancel=new JButton("Cancel");
        add(cancel);
        cancel.setBounds(190,165,100,20);
        
        
         String[] header=new String[2];
        header[0]="User Name";
        header[1]="Type";
         model = new DefaultTableModel(null,header);
   // JTable table = new JTable(model);
        table=new JTable(model);
        jsp=new JScrollPane(table);
        add(jsp);
        jsp.setBounds(70,55,220,100);

        String[] rowdata=new String[2];

//        DBConnection db=new DBConnection();
  //      Connection con = db.getConnection();

        PreparedStatement ps;
        ResultSet rs;

        String sql_select="select username,type from prison.profile;";

        try
        {
    //        ps=con.prepareStatement(sql_select);
      //      rs=ps.executeQuery();
            while(rs.next())
            {
                rowdata[0]=rs.getString(1);
                rowdata[1]=rs.getString(2);
                model.addRow(rowdata);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



        



        ActionListener c=new MyActionListener();
        cancel.addActionListener(c);
        cancel.setActionCommand("cancel");
        remove.addActionListener(c);
        remove.setActionCommand("remove");
        

        setVisible(true);
        setTitle("Delete User");
        setBounds(330,200,380,250);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

     class MyActionListener implements ActionListener
 {
  public void actionPerformed(ActionEvent ae)
  {
    String s = ae.getActionCommand();
    if (s.equals("cancel"))
    {
           setVisible(false);
    }
      else if(s.equals("remove"))
    {

          int row=table.getSelectedRow();
          if(row!=-1)
          {
           DBConnection db=new DBConnection();
           Connection con = db.getConnection();

            PreparedStatement ps,ps2;
            ResultSet rs;
             String sql_select="select username from prison.profile 
where type='admin';";

        try
        {
            ps=con.prepareStatement(sql_select);
            rs=ps.executeQuery();
            rs.last();
            System.out.println("on_row:"+rs.getRow());
            System.out.println("on_row:"+table.getValueAt
(row,1).toString());
            if(rs.getRow()==1&&table.getValueAt(row,1).toString
().equals("admin"))
            {
                JOptionPane.showMessageDialog(null,"Sorry there is only 
one Administrator..!");
            }
            else
            {
                //String selected[]=new String[1];
                String selected=table.getValueAt(row,0).toString();
                String sql_delete="delete from prison.profile where 
username='"+selected+"';";
                ps2=con.prepareStatement(sql_delete);
                ps2.executeUpdate();
                model.removeRow(row);
                table.validate();
                JOptionPane.showMessageDialog(null,"Profile 
removed..!");

            }

        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
 else
      JOptionPane.showMessageDialog(null,"No profile selected..!");


    }

  }
}
     
}

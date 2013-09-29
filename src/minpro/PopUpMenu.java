/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;

import javax.swing.*;
import java.awt.event.*;

public class PopUpMenu{
  JPopupMenu Pmenu;
  JMenuItem menuItem;
  public static void main(String[] args) {
  PopUpMenu p = new PopUpMenu();
  }

  public PopUpMenu(){
  JFrame frame = new JFrame("Creating a Popup Menu");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Pmenu = new JPopupMenu();
  menuItem = new JMenuItem("Cut");
  Pmenu.add(menuItem);
  menuItem = new JMenuItem("Copy");
  Pmenu.add(menuItem);
  menuItem = new JMenuItem("Paste");
  Pmenu.add(menuItem);
  menuItem = new JMenuItem("Delete");
  Pmenu.add(menuItem);
  menuItem = new JMenuItem("Undo");
  Pmenu.add(menuItem);
  menuItem.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){}
  });
  frame.addMouseListener(new MouseAdapter(){
  public void mouseReleased(MouseEvent Me){
  if(Me.isPopupTrigger()){
  Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
  }
  }
  });
  frame.setSize(400,400);
  frame.setVisible(true);
  }
}

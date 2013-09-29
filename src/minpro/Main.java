/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minpro;



/**
 *
 * @author NONAME.CPP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      MainFrame f1 = new MainFrame();
      f1.setVisible(true);
      MyServer.SListen();
      
     
    }
}

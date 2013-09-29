/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sooraj
 */
public class loadThread extends Thread{
    @Override
    public void run()
    {
        try {
            Thread.sleep(100);
             FlagClass.conditions="reload";
            clientSystems.trackMessage();
        } catch (InterruptedException ex) {
           // Logger.getLogger(loadThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

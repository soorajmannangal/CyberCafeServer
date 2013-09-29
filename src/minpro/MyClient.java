/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minpro;

/**
 *
 * @author NONAME.CPP
 */
import java.io.*;
import java.net.*;

public class MyClient {
    public  MyClient(String userInput,String ip4,int port)  {


    	Socket echoSocket = null;
        PrintWriter out = null;
        
        try {

        	echoSocket = new Socket(ip4, port);
            out = new PrintWriter(echoSocket.getOutputStream(), true);

        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: .");

        } catch (IOException e) {
            System.err.println("ioerror");

        }
	    out.println(userInput);
	out.close();
	try {
		echoSocket.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
}
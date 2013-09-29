/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minpro;

/**
 *
 * @author NONAME.CPP
 */
import java.net.*;
import java.io.*;
import java.sql.ResultSet;

public class MyServer extends Thread
{
 protected Socket clientSocket;
public static String msg="test msg";
 public static void SListen()
   {
       //MainFrame.addbutt();
     ServerSocket serverSocket = null;
    try {
         serverSocket = new ServerSocket(10008);
         //System.out.println ("Connection Socket Created");
         try {
              while (true)
                 {
                 System.out.println ("Waiting for Connection");
                  new MyServer().MyServ(serverSocket.accept());
                 }
             }
         catch (IOException e){}

        }
    catch (IOException e){}

    finally
        {
         try {
              serverSocket.close();
             }
         catch (IOException e){}

        }
   }

 public void MyServ(Socket clientSoc)
   {
    clientSocket = clientSoc;
    start();
   }
 public void run()
   {
    System.out.println ("New Communication Thread Started");

    try {
         //PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),
           //                           true);
         BufferedReader in = new BufferedReader(
                 new InputStreamReader( clientSocket.getInputStream()));

         String inputLine;
//int i=1;
         if ((inputLine = in.readLine()) != null)
             {
              System.out.println ("Server: " + inputLine);

              //msg format 1- "Application_Started;20008;
              msg=inputLine;

              //System Registration in database
              if(msg.startsWith("Application"))
              {
                String[] s1=msg.split(";");

                FlagClass.port=Integer.parseInt(s1[1]);
                FlagClass.SysName = clientSocket.getInetAddress().getHostName();

              }
              FlagClass.Ip = clientSocket.getInetAddress().getHostAddress();
              FlagClass.msg = msg;
              FlagClass.conditions="register";
              clientSystems.trackMessage();
             }

         in.close();
         clientSocket.close();
        }
    catch (IOException e)
        {
         System.err.println("Problem with Communication Server");
        }
    }
}
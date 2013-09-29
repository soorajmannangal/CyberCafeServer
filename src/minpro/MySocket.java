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
public class MySocket{
	ServerSocket providerSocket;
	Socket connection = null;
	ObjectOutputStream out;
	ObjectInputStream in;
	String message;
	MySocket(){}
	void run()
	{
		try{
			//1. creating a server socket
			providerSocket = new ServerSocket(2004, 10);
			//2. Wait for connection
			System.out.println("Waiting for connection");
			connection = providerSocket.accept();
			System.out.println("Connection received from " + connection.getInetAddress().getHostName());
			//3. get Input and Output streams
			out = new ObjectOutputStream(connection.getOutputStream());
			out.flush();
			in = new ObjectInputStream(connection.getInputStream());
			
			//4. The two parts communicate via the input and output streams
			do{
				try{
                                        //sendMessage("login");
					message = (String)in.readObject();
					System.out.println("client>" + message);
					if (message.equals("loggedin"))
                                        {
                                        }
						//sendMessage("logout");
                                        //if(message.equals("loggedout"))
                                          //  sendMessage("shutdown");
				}
                                catch(SocketException s1){
                                    
                                }
				catch(ClassNotFoundException classnot){
					System.err.println("Data received in unknown format");
				}
			}while(!message.equals("ede"));
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally{
			//4: Closing connection
			try{
				in.close();
				out.close();
				providerSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	void sendMessage(String msg)
	{
		try{
			out.writeObject(msg);
			out.flush();
			System.out.println("server>" + msg);
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		MySocket server = new MySocket();
		while(true){
			server.run();
		}
	}
}

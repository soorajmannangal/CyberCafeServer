/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package minpro;
import java.sql.*;
/**
 *
 * @author NONAME.CPP
 */
public class SqlConnection {
                        String host="localhost";
			String dbName="XE";
			int port=1521;
			String oracleURL="jdbc:oracle:thin:@"+host+":"+port+":"+dbName;

			String username="SYSTEM";
			String password="password";
                        Connection connect;
                        Statement statment;
    public SqlConnection() {
        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");


			connect=DriverManager.getConnection(oracleURL,username,password);
                        statment=connect.createStatement();
        }catch(SQLException s1){


        }catch(ClassNotFoundException cnfe)
		{	System.out.println("Error : "+cnfe);
		}

    }
    public ResultSet run_query(String Q)
	{	
		ResultSet resultSet = null;
			//System.out.println("Before Connection");
				
				//System.out.println("After Connection");
				
				//System.out.println("Statment Created");
try{
				resultSet=statment.executeQuery(Q);
				//System.out.println("Query Executed");

				//connect.close();
				//System.out.println("Connection Closed");

}catch(SQLException s1){
    return resultSet;
}
				
			return resultSet;
	}
		
	

}

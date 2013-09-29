/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro;

import java.sql.*;
/**
 *
 * @author gokul
 */
 class sqlCon {
     public Connection getConnection()
{
Connection con=null;
try
{
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@loaclhost:1521:XE","SYSTEM","password");
    
    
}
catch(Exception e)
{
    System.out.println("error");
}
return con;
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrecord;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Charliz Dana
 */
public class ConnectDb {
    public static Connection Connect(){
       
       Connection conn = null;
       try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
           conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","studentRecord","record");
           System.out.println("Successful Connection!");
       }catch(Exception e){
            System.out.println(e);
   }
       return conn;
               }
}

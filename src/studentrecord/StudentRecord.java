/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrecord;

import studentrecord.ConnectDb;
import studentrecord.Dashboard;

/**
 *
 * @author Charliz Dana
 */
public class StudentRecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectDb.Connect();
        Dashboard ms = new Dashboard();
        ms.setVisible(true);
    } 
}
    


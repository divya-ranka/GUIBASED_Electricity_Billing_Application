package javaapplication2;

import java.sql.*;

public class Conn {
                
    Connection c;
    Statement s;
   
    Conn(){    
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricity","root","12345");
            s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}



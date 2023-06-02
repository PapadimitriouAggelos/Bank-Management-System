package bankmanagementsystem;

import java.sql.*;

public class Conn 
{
    Connection c;
    Statement s;
    
    //constructor
    Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "ANJELROSEmusic@123");
            s= c.createStatement(); //η μέθοδος createStatement() δημιουργεί ένα αντικείμενο τύπου Statement για την 
            //αποστολή statement στην βάση δεδομένων
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}

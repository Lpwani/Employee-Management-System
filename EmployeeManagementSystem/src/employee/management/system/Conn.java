
package employee.management.system;
import java.sql.*;      // For creating connection string 2) step...

public class Conn{
     // step 1) Register the Driver class
     // step 2) Creating the connection String
    Connection c;
     // step 3) Creating the statement
    Statement s;
     // step 4) Executing mysql queires
     // step 5) Closing the connections
    
     // since mySql is the external entity so there is a high chance of error occuring...
    
    public Conn(){
        try{
            // Step 1) Register the Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");   // we need to first add jar 
            // folder of mysql connector and then there is the [articular file present in the jar file...
            
            // step 2) Creating the connection string.
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","lok@1234");
            // //localhost:3306/EmployeeManagementSystem","root","Lok@12345678912345
            // step 3) Creating the statement
            s = c.createStatement();
            
            // step 4) Executing mysql queries
            
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    // Step 1:
    
}

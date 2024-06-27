package bank.management.system;

import java.sql.*;

public class Connect {
    Connection connection;
    Statement statement;
    public Connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BankManagementSystem","root","devshah");
            statement = connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

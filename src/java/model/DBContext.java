package model;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    public DBContext(String _serverName,String _dbName,String _portNum,String _username,String _password) {
        this.serverName = _serverName;
        this.dbName = _dbName;
        this.portNumber = _portNum;
        this.userID = _username;
        this.password = _password;
    }
    /*Insert your other code right after this comment*/
   
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private String serverName;
    private String dbName;
    private String portNumber;
    private String userID;
    private String password;
}
package util;
import java.sql.*;
public class GetConnection {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";        
    static final String USER = "root";
    static final String PASS = "123456";
    public static Connection connectDB(String DBName)
    {
    	String DB_URL = "jdbc:mysql://localhost:3306/"
	    		+DBName+"?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&characterEncoding=utf-8";	
    	Connection con = null;
    	try{
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);	        
    	}catch(Exception e){}
    	
    	try {
            System.out.println("连接数据库...");
            //连接代码 
            con = DriverManager.getConnection(DB_URL,USER,PASS);
    	}catch(SQLException e){}
    	
    	return con;	    	
    }
}

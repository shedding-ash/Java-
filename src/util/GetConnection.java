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
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);	        
    	}catch(Exception e){}
    	
    	try {
            System.out.println("�������ݿ�...");
            //���Ӵ��� 
            con = DriverManager.getConnection(DB_URL,USER,PASS);
    	}catch(SQLException e){}
    	
    	return con;	    	
    }
}

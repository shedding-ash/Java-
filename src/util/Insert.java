package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Insert {
	public static void insert(String str1) 
	{
		 Connection con = null;
	        Statement stmt = null;
	        try{
	            con=GetConnection.connectDB("students");
	            stmt = con.createStatement();
	            String sql;
	            sql = "insert into str1(text) "
	            		+ "values ('"+str1+"')";
	            stmt.executeUpdate(sql);
	            System.out.println("插入成功");
	            // 完成后关闭
	            stmt.close();
	            con.close();
	        }catch(SQLException se){
	            // 处理 JDBC 错误
	            se.printStackTrace();
	        }catch(Exception e){
	            // 处理 Class.forName 错误
	            e.printStackTrace();
	        }finally{
	            // 关闭资源
	            try{
	                if(stmt!=null) stmt.close();
	            }catch(SQLException se2){
	            }// 什么都不做
	            try{
	                if(con!=null) con.close();
	            }catch(SQLException se){
	                se.printStackTrace();
	            }
	        }

	}
}
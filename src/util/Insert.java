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
	            System.out.println("����ɹ�");
	            // ��ɺ�ر�
	            stmt.close();
	            con.close();
	        }catch(SQLException se){
	            // ���� JDBC ����
	            se.printStackTrace();
	        }catch(Exception e){
	            // ���� Class.forName ����
	            e.printStackTrace();
	        }finally{
	            // �ر���Դ
	            try{
	                if(stmt!=null) stmt.close();
	            }catch(SQLException se2){
	            }// ʲô������
	            try{
	                if(con!=null) con.close();
	            }catch(SQLException se){
	                se.printStackTrace();
	            }
	        }

	}
}
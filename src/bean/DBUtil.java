package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	String url="jdbc:mysql://localhost:3306/comment";
	String user="root";
	String password="";
	String DBDRIVER="com.mysql.jdbc.Driver";
	Connection conn=null;
	SQLException ex=null;
	public DBUtil(){				
	try{
		conn=DriverManager.getConnection(url, user, password);
		System.out.println("连接数据库成功");
		
	}catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("shibai");
	}
}
	public Connection getCon() throws Exception {
		
		Class.forName(DBDRIVER);
		conn = DriverManager.getConnection(url,user,password);
		System.out.println("successDBDRIVER");
		return conn;
		
	}
	public void  closeAll(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
public static void main(String args[]){
	DBUtil bb=new DBUtil();
	try {
		bb.getCon();
		System.out.println("连接数据库成功");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		bb.closeAll();
	}
}
}


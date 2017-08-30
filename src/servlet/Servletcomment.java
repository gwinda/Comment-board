package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DBUtil;




@WebServlet("/Servletcomment")
public class Servletcomment extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String time=df.format(new Date());// new Date()Ϊ��ȡ��ǰϵͳʱ��
		HttpSession session=request.getSession();
		String comment=request.getParameter("comment");  //��ȡcomment
		String Crank=request.getParameter("Crank");       //��ȡ����Crank
		System.out.print(Crank);
		String user=(String)session.getAttribute("user");
		if(comment!=null){
			System.out.print("��Ϊ�գ���");
			
		DBUtil db = new DBUtil();                                  //��DB
		Connection conn=null;		
		PreparedStatement pst=null;           ////�����Ự
		try {
			conn = db.getCon();
			pst=  conn.prepareStatement("insert into comments(comment,time,CPhone,Crank) values(?,?,?,?)");
			pst.setString(1, comment);
			pst.setString(2, time);
			pst.setString(3,  user);
			pst.setString(4, Crank);
			pst.executeUpdate();
			System.out.print("ok");
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			if (pst != null)
				try {
					pst.close();

				}catch (SQLException e) {
			}

			if (conn != null)
				try {
					conn.close();

				} catch (SQLException e) {
					
				}
			request.getRequestDispatcher("input.jsp").forward(request, response);
		}
		
	}
		else{
			 System.out.print("����Ϊ�գ���");
		}
	}

}



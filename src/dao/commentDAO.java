package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Beancomment;
import bean.DBUtil;


public class commentDAO {
	//返回评论信息
	public List<Beancomment> getBeancomment() throws Exception{    //Beancomment类
		DBUtil db = new DBUtil();
		Connection conn=null;
		Statement statement=null;
		ResultSet result=null;
		SQLException ex=null;
		List<Beancomment> comments=null;
		try{
			conn = db.getCon();
			statement=conn.createStatement();
			result=statement.executeQuery("SELECT * FROM comments;");
			comments =new ArrayList<Beancomment>();
			while(result.next()){
				Beancomment comment=new Beancomment();
				comment.setId(result.getInt(1));
				comment.setComment(result.getString(2));
				comment.setTime(result.getString(3));
				comment.setCPhone(result.getString(4));
				comment.setCrank(result.getDouble("Crank"));
				comments.add(comment);
			}
		}catch (SQLException e){
			
			ex=e;
		}finally{
			if(statement!=null){
				try{
					statement.close();
				}catch (SQLException e){
					if(ex==null){
						ex=e;
					}
				}
			}
			if(conn!=null){
				try{
					conn.close();
					
				}
				catch(SQLException e){
					if(ex==null){
						ex=e;
					}
				}
			}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
		}
		return comments;
	}
	
	//删除指定id的评论
		public boolean deleteComment(int nid)
		{

			PreparedStatement pstat;
			String sql = "";
			DBUtil db = new DBUtil();
			Connection conn=null;
			boolean flag = true;
			sql = "delete from comments where id = ?";
			try {
				conn = db.getCon();
				pstat = conn.prepareStatement(sql);
				pstat.setInt(1, nid);
				int i = pstat.executeUpdate();
				if(i==0)
				{
					flag = false;
					System.out.println("删除失败");
				}
				else {
					flag=true;
					System.out.println("删除成功");
				}
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			return flag;
		}



	public void setBeancomment(List<Beancomment> beancomment) {
		beancomment = beancomment;
	}

}

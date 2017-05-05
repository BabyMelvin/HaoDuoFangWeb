package com.hdf.dao;
/*jdbc连接相关信息*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*用于jdbc连接*/
public class BaseDao {
	public static final String DRIVER="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/ybzj?useUnicode=true&characterEncoding=utf-8";
	public static final String USER="root";
	public static final String PASSWORD="12345";
	Connection conn=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;
	public void getConnection(){
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public int executeUpdate(String sql,Object... obj){
		int num=0;
		getConnection();
		try {
			pstm=conn.prepareStatement(sql);
			for(int i=0;i<obj.length;i++){
				pstm.setObject(i+1, obj[i]);
			}
			num=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//closeAll();
		}
		return num;
	}
	public  ResultSet executeQuery(String sql,Object... obj){
		getConnection();
		try {
			pstm=conn.prepareStatement(sql);
			for(int i=0;i<obj.length;i++){
				pstm.setObject(i+1, obj[i]);
			}
			rs=pstm.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
	public void closeAll(){
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


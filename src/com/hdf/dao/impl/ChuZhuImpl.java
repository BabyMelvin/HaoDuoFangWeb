package com.hdf.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdf.dao.BaseDao;
import com.hdf.dao.ChuZhuDao;
import com.hdf.entity.ChuZhu;

public class ChuZhuImpl extends BaseDao implements ChuZhuDao{
	ResultSet rs=null;
	public int addChuZhu(ChuZhu cz) {
		// TODO Auto-generated method stub
		System.out.println(cz);
		int num=0;
		String sql="insert into chuzhu(date,name,floor,area,decoration,carbarn,price,detail) values(?,?,?,?,?,?,?,?)";
		num=executeUpdate(sql,cz.getDate(),cz.getName(),cz.getFloor(),cz.getArea(),cz.getDecoration(),cz.getCarbarn(),cz.getPrice(),cz.getDetail());
		return num;
	}

	public int delChuZhu(int id) {
		// TODO Auto-generated method stub
		int num=0;
		String sql="delete from chuzhu where id=?";
		num=executeUpdate(sql,id);
		return num;
	}

	public int updateChouZhu(ChuZhu cz) {
		// TODO Auto-generated method stub
		int num=0;
		String sql="update chuzhu set date=?,name=?,floor=?,area=?,decoration=?,carbarn=?,price=?,detail=? where id=?";
		num=executeUpdate(sql,cz.getDate(),cz.getName(),cz.getFloor(),cz.getArea(),cz.getDecoration(),cz.getCarbarn(),cz.getPrice(),cz.getDetail());
		return num;
	}

	public ChuZhu findChuZhuById(int id) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,id);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByDate(String date) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where date=?";
		rs=executeQuery(sql,date);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByName(String name) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,name);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByFloor(String floor) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		 rs=executeQuery(sql,floor);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByArea(String area) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,area);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByDecoration(String decoration) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,decoration);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByCarbarn(String carbarn) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
	    rs=executeQuery(sql,carbarn);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByPrice(String price) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,price);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public ChuZhu findChuZhuByDetail(String detail) {
		// TODO Auto-generated method stub
		ChuZhu cz=null;
		String sql="select * from chuzhu where id=?";
		rs=executeQuery(sql,detail);
		try {
			if(rs.next()){
				cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cz;
	}

	public List<ChuZhu> getAllChuZhu() {
		// TODO Auto-generated method stub
		List<ChuZhu> czlist=new ArrayList<ChuZhu>();
		String sql="select * from chuzhu";
		rs=executeQuery(sql);
		try {
			while(rs.next()){
				ChuZhu cz=new ChuZhu(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
				czlist.add(cz);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return czlist;
	}
}

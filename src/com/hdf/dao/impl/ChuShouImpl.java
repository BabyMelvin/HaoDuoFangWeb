package com.hdf.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdf.dao.BaseDao;
import com.hdf.dao.ChuShouDao;
import com.hdf.entity.ChuShou;

public class ChuShouImpl extends BaseDao implements ChuShouDao{
	ResultSet rs=null;
	public int addChuShou(ChuShou cs) {
		// TODO Auto-generated method stub
		System.out.println(cs);
		int num=0;
		String sql="insert into chushou(date,name,floor,area,decoration,carbarn,price,detail) values(?,?,?,?,?,?,?,?)";
		num=executeUpdate(sql,cs.getDate(),cs.getName(),cs.getFloor(),cs.getArea(),cs.getDecoration(),cs.getCarbarn(),cs.getPrice(),cs.getDetail());
		return num;
	}

	public int delChuShou(int id) {
		// TODO Auto-generated method stub
		int num=0;
		String sql="delete from chushou where id=?";
		num=executeUpdate(sql,id);
		return num;
	}

	public int updateChouShou(ChuShou cs) {
		// TODO Auto-generated method stub
		int num=0;
		String sql="update chushou set date=?,name=?,floor=?,area=?,decoration=?,carbarn=?,price=?,detail=? where id=?";
		num=executeUpdate(sql,cs.getDate(),cs.getName(),cs.getFloor(),cs.getArea(),cs.getDecoration(),cs.getCarbarn(),cs.getPrice(),cs.getDetail(),cs.getId());
		return num;
	}

	public ChuShou findChuShouById(int id) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,id);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByDate(String date) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,date);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByName(String name) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,name);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByFloor(String floor) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,floor);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByArea(String area) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,area);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByDecoration(String decoration) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,decoration);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByCarbarn(String carbarn) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,carbarn);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByPrice(String price) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,price);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public ChuShou findChuShouByDetail(String detail) {
		// TODO Auto-generated method stub
		ChuShou cs=null;
		String sql="select * from chushou where id=?";
		rs=executeQuery(sql,detail);
		try {
			if(rs.next()){
				cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cs;
	}

	public List<ChuShou> getAllChuShou() {
		// TODO Auto-generated method stub
		List<ChuShou> cslist=new ArrayList<ChuShou>();
		String sql="select * from chushou";
		rs=executeQuery(sql);
		try {
			while(rs.next()){
				ChuShou cs=new ChuShou(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
				//System.out.println(cs);
				cslist.add(cs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cslist;
	}

}

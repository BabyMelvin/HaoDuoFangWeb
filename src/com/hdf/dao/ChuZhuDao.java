package com.hdf.dao;

import java.util.List;

import com.hdf.entity.ChuZhu;

/*出租相关接口*/
public interface ChuZhuDao {
	public int addChuZhu(ChuZhu cz);
	public int delChuZhu(int id);
	public int updateChouZhu(ChuZhu cz);
	public ChuZhu findChuZhuById(int id);
	public ChuZhu findChuZhuByDate(String date);
	public ChuZhu findChuZhuByName(String name);
	public ChuZhu findChuZhuByFloor(String floor);
	public ChuZhu findChuZhuByArea(String area);
	public ChuZhu findChuZhuByDecoration(String decoration);
	public ChuZhu findChuZhuByCarbarn(String carbarn);
	public ChuZhu findChuZhuByPrice(String price);
	public ChuZhu findChuZhuByDetail(String detail);
	public List<ChuZhu> getAllChuZhu();
}

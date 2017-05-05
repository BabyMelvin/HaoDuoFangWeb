package com.hdf.dao;

import java.util.List;

import com.hdf.entity.ChuShou;

/*出售相关接口*/
public interface ChuShouDao {
	public int addChuShou(ChuShou cs);
	public int delChuShou(int id);
	public int updateChouShou(ChuShou cs);
	public ChuShou findChuShouById(int id);
	public ChuShou findChuShouByDate(String date);
	public ChuShou findChuShouByName(String name);
	public ChuShou findChuShouByFloor(String floor);
	public ChuShou findChuShouByArea(String area);
	public ChuShou findChuShouByDecoration(String decoration);
	public ChuShou findChuShouByCarbarn(String carbarn);
	public ChuShou findChuShouByPrice(String price);
	public ChuShou findChuShouByDetail(String detail);
	public List<ChuShou> getAllChuShou();
}

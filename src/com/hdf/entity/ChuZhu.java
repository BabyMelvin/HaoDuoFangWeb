package com.hdf.entity;

import java.io.Serializable;

public class ChuZhu implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String date;
	private String name;
	private String floor;
	private String area;
	private String decoration;
	private String carbarn;
	private String price;
	private String detail;
	public ChuZhu(int id, String date, String name, String floor, String area,
			String decoration, String carbarn, String price, String detail) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.floor = floor;
		this.area = area;
		this.decoration = decoration;
		this.carbarn = carbarn;
		this.price = price;
		this.detail = detail;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDecoration() {
		return decoration;
	}
	public void setDecoration(String decoration) {
		this.decoration = decoration;
	}
	public String getCarbarn() {
		return carbarn;
	}
	public void setCarbarn(String carbarn) {
		this.carbarn = carbarn;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ChuZhu [id=" + id + ", date=" + date + ", name=" + name
				+ ", floor=" + floor + ", area=" + area + ", decoration="
				+ decoration + ", carbarn=" + carbarn + ", price=" + price
				+ ", detail=" + detail + "]";
	}
	
}

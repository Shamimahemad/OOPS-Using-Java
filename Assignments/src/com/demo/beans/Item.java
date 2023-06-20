package com.demo.beans;

public class Item {
	private int id;
	private String iname;
	private int qty;
	public Item() {
		super();
	}
	public Item(int id, String iname, int qty) {
		super();
		this.id = id;
		this.iname = iname;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", iname=" + iname + ", qty=" + qty + "]";
	}

}

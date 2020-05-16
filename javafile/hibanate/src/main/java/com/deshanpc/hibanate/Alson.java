package com.deshanpc.hibanate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;



@Entity
@Table(name="Hibernate_table")
public class Alson {
	
	@Id
	private int aid;
	private Alion_name aname;
	@Column(name="Color_colomn")
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public Alion_name getAname() {
		return aname;
	}
	public void setAname(Alion_name aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alson [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	

}

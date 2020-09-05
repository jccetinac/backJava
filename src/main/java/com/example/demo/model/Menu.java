package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="item")
	private String item;
	@Column(name="subitem")
	private String subitem;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getSubitem() {
		return subitem;
	}
	public void setSubitem(String subitem) {
		this.subitem = subitem;
	}
	public Menu() {}

	
	
	
}

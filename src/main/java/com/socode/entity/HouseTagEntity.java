package com.socode.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 房屋标签映射关系表
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Entity
@Table(name="house_tag")  
public class HouseTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//房屋id
	@Column
	private Integer houseId;
	//标签id
	@Id  
	@Column(name="id",nullable = false)  
	@GeneratedValue 
	private Integer id;
	//
	@Column
	private String name;

	/**
	 * 设置：房屋id
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：房屋id
	 */
	public Integer getHouseId() {
		return houseId;
	}
	/**
	 * 设置：标签id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：标签id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
}

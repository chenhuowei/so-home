package com.socode.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author hotway
 * @email chenhuowei@outlook.com
 * @date 2018-03-10 16:03:28
 */
@Entity
@Table(name="subway")  
public class SubwayEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	@Id  
	@Column(name="id",nullable = false)  
	@GeneratedValue 
	private Integer id;
	//线路名
	@Column
	private String name;
	//所属城市英文名缩写
	@Column
	private String cityEnName;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：线路名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：线路名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：所属城市英文名缩写
	 */
	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
	}
	/**
	 * 获取：所属城市英文名缩写
	 */
	public String getCityEnName() {
		return cityEnName;
	}
}

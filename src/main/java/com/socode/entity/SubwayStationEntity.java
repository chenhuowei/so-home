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
@Table(name="subway_station")  
public class SubwayStationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	@Id  
	@Column(name="id",nullable = false)  
	@GeneratedValue 
	private Integer id;
	//所属地铁线id
	@Column
	private Integer subwayId;
	//站点名称
	@Column
	private String name;

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
	 * 设置：所属地铁线id
	 */
	public void setSubwayId(Integer subwayId) {
		this.subwayId = subwayId;
	}
	/**
	 * 获取：所属地铁线id
	 */
	public Integer getSubwayId() {
		return subwayId;
	}
	/**
	 * 设置：站点名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：站点名称
	 */
	public String getName() {
		return name;
	}
}

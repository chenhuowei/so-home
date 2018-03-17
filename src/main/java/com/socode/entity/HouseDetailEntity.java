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
@Table(name="house_detail")  
public class HouseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	@Id  
	@Column(name="id",nullable = false)  
	@GeneratedValue 
	private Integer id;
	//详细描述
	@Column
	private String description;
	//户型介绍
	@Column
	private String layoutDesc;
	//交通出行
	@Column
	private String traffic;
	//周边配套
	@Column
	private String roundService;
	//租赁方式
	@Column
	private Integer rentWay;
	//详细地址 
	@Column
	private String address;
	//附近地铁线id
	@Column
	private Integer subwayLineId;
	//附近地铁线名称
	@Column
	private String subwayLineName;
	//地铁站id
	@Column
	private Integer subwayStationId;
	//地铁站名
	@Column
	private String subwayStationName;
	//对应house的id
	@Column
	private Integer houseId;

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
	 * 设置：详细描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：详细描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：户型介绍
	 */
	public void setLayoutDesc(String layoutDesc) {
		this.layoutDesc = layoutDesc;
	}
	/**
	 * 获取：户型介绍
	 */
	public String getLayoutDesc() {
		return layoutDesc;
	}
	/**
	 * 设置：交通出行
	 */
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	/**
	 * 获取：交通出行
	 */
	public String getTraffic() {
		return traffic;
	}
	/**
	 * 设置：周边配套
	 */
	public void setRoundService(String roundService) {
		this.roundService = roundService;
	}
	/**
	 * 获取：周边配套
	 */
	public String getRoundService() {
		return roundService;
	}
	/**
	 * 设置：租赁方式
	 */
	public void setRentWay(Integer rentWay) {
		this.rentWay = rentWay;
	}
	/**
	 * 获取：租赁方式
	 */
	public Integer getRentWay() {
		return rentWay;
	}
	/**
	 * 设置：详细地址 
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：详细地址 
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：附近地铁线id
	 */
	public void setSubwayLineId(Integer subwayLineId) {
		this.subwayLineId = subwayLineId;
	}
	/**
	 * 获取：附近地铁线id
	 */
	public Integer getSubwayLineId() {
		return subwayLineId;
	}
	/**
	 * 设置：附近地铁线名称
	 */
	public void setSubwayLineName(String subwayLineName) {
		this.subwayLineName = subwayLineName;
	}
	/**
	 * 获取：附近地铁线名称
	 */
	public String getSubwayLineName() {
		return subwayLineName;
	}
	/**
	 * 设置：地铁站id
	 */
	public void setSubwayStationId(Integer subwayStationId) {
		this.subwayStationId = subwayStationId;
	}
	/**
	 * 获取：地铁站id
	 */
	public Integer getSubwayStationId() {
		return subwayStationId;
	}
	/**
	 * 设置：地铁站名
	 */
	public void setSubwayStationName(String subwayStationName) {
		this.subwayStationName = subwayStationName;
	}
	/**
	 * 获取：地铁站名
	 */
	public String getSubwayStationName() {
		return subwayStationName;
	}
	/**
	 * 设置：对应house的id
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：对应house的id
	 */
	public Integer getHouseId() {
		return houseId;
	}
}

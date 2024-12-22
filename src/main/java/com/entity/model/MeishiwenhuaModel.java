package com.entity.model;

import com.entity.MeishiwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食文化
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public class MeishiwenhuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 地区分类
	 */
	
	private String diqufenlei;
		
	/**
	 * 配图
	 */
	
	private String peitu;
		
	/**
	 * 内容
	 */
	
	private String neirong;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：地区分类
	 */
	 
	public void setDiqufenlei(String diqufenlei) {
		this.diqufenlei = diqufenlei;
	}
	
	/**
	 * 获取：地区分类
	 */
	public String getDiqufenlei() {
		return diqufenlei;
	}
				
	
	/**
	 * 设置：配图
	 */
	 
	public void setPeitu(String peitu) {
		this.peitu = peitu;
	}
	
	/**
	 * 获取：配图
	 */
	public String getPeitu() {
		return peitu;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}

package com.entity.view;

import com.entity.DiscussmeishiwenhuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食文化评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
@TableName("discussmeishiwenhua")
public class DiscussmeishiwenhuaView  extends DiscussmeishiwenhuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeishiwenhuaView(){
	}
 
 	public DiscussmeishiwenhuaView(DiscussmeishiwenhuaEntity discussmeishiwenhuaEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeishiwenhuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

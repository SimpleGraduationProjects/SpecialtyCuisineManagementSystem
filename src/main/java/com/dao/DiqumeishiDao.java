package com.dao;

import com.entity.DiqumeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiqumeishiVO;
import com.entity.view.DiqumeishiView;


/**
 * 地区美食
 * 
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface DiqumeishiDao extends BaseMapper<DiqumeishiEntity> {
	
	List<DiqumeishiVO> selectListVO(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
	
	DiqumeishiVO selectVO(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
	
	List<DiqumeishiView> selectListView(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);

	List<DiqumeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
	
	DiqumeishiView selectView(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
	
}

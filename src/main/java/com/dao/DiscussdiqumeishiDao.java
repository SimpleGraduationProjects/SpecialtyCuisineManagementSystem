package com.dao;

import com.entity.DiscussdiqumeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdiqumeishiVO;
import com.entity.view.DiscussdiqumeishiView;


/**
 * 地区美食评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface DiscussdiqumeishiDao extends BaseMapper<DiscussdiqumeishiEntity> {
	
	List<DiscussdiqumeishiVO> selectListVO(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
	
	DiscussdiqumeishiVO selectVO(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
	
	List<DiscussdiqumeishiView> selectListView(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);

	List<DiscussdiqumeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
	
	DiscussdiqumeishiView selectView(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
	
}

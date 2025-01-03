package com.dao;

import com.entity.MeishiwenhuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishiwenhuaVO;
import com.entity.view.MeishiwenhuaView;


/**
 * 美食文化
 * 
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface MeishiwenhuaDao extends BaseMapper<MeishiwenhuaEntity> {
	
	List<MeishiwenhuaVO> selectListVO(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
	
	MeishiwenhuaVO selectVO(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
	
	List<MeishiwenhuaView> selectListView(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);

	List<MeishiwenhuaView> selectListView(Pagination page,@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
	
	MeishiwenhuaView selectView(@Param("ew") Wrapper<MeishiwenhuaEntity> wrapper);
	
}

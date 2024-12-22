package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishiwenhuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishiwenhuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishiwenhuaView;


/**
 * 美食文化评论表
 *
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface DiscussmeishiwenhuaService extends IService<DiscussmeishiwenhuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishiwenhuaVO> selectListVO(Wrapper<DiscussmeishiwenhuaEntity> wrapper);
   	
   	DiscussmeishiwenhuaVO selectVO(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
   	
   	List<DiscussmeishiwenhuaView> selectListView(Wrapper<DiscussmeishiwenhuaEntity> wrapper);
   	
   	DiscussmeishiwenhuaView selectView(@Param("ew") Wrapper<DiscussmeishiwenhuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishiwenhuaEntity> wrapper);
   	
}


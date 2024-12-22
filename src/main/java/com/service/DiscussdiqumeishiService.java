package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdiqumeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdiqumeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdiqumeishiView;


/**
 * 地区美食评论表
 *
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface DiscussdiqumeishiService extends IService<DiscussdiqumeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdiqumeishiVO> selectListVO(Wrapper<DiscussdiqumeishiEntity> wrapper);
   	
   	DiscussdiqumeishiVO selectVO(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
   	
   	List<DiscussdiqumeishiView> selectListView(Wrapper<DiscussdiqumeishiEntity> wrapper);
   	
   	DiscussdiqumeishiView selectView(@Param("ew") Wrapper<DiscussdiqumeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdiqumeishiEntity> wrapper);
   	
}


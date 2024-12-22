package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiqumeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiqumeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiqumeishiView;


/**
 * 地区美食
 *
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
public interface DiqumeishiService extends IService<DiqumeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiqumeishiVO> selectListVO(Wrapper<DiqumeishiEntity> wrapper);
   	
   	DiqumeishiVO selectVO(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
   	
   	List<DiqumeishiView> selectListView(Wrapper<DiqumeishiEntity> wrapper);
   	
   	DiqumeishiView selectView(@Param("ew") Wrapper<DiqumeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiqumeishiEntity> wrapper);
   	
}


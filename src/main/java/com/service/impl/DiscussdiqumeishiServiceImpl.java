package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdiqumeishiDao;
import com.entity.DiscussdiqumeishiEntity;
import com.service.DiscussdiqumeishiService;
import com.entity.vo.DiscussdiqumeishiVO;
import com.entity.view.DiscussdiqumeishiView;

@Service("discussdiqumeishiService")
public class DiscussdiqumeishiServiceImpl extends ServiceImpl<DiscussdiqumeishiDao, DiscussdiqumeishiEntity> implements DiscussdiqumeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdiqumeishiEntity> page = this.selectPage(
                new Query<DiscussdiqumeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussdiqumeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdiqumeishiEntity> wrapper) {
		  Page<DiscussdiqumeishiView> page =new Query<DiscussdiqumeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdiqumeishiVO> selectListVO(Wrapper<DiscussdiqumeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdiqumeishiVO selectVO(Wrapper<DiscussdiqumeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdiqumeishiView> selectListView(Wrapper<DiscussdiqumeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdiqumeishiView selectView(Wrapper<DiscussdiqumeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.DiqumeishiDao;
import com.entity.DiqumeishiEntity;
import com.service.DiqumeishiService;
import com.entity.vo.DiqumeishiVO;
import com.entity.view.DiqumeishiView;

@Service("diqumeishiService")
public class DiqumeishiServiceImpl extends ServiceImpl<DiqumeishiDao, DiqumeishiEntity> implements DiqumeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiqumeishiEntity> page = this.selectPage(
                new Query<DiqumeishiEntity>(params).getPage(),
                new EntityWrapper<DiqumeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiqumeishiEntity> wrapper) {
		  Page<DiqumeishiView> page =new Query<DiqumeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiqumeishiVO> selectListVO(Wrapper<DiqumeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiqumeishiVO selectVO(Wrapper<DiqumeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiqumeishiView> selectListView(Wrapper<DiqumeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiqumeishiView selectView(Wrapper<DiqumeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

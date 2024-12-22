package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiqumeishiEntity;
import com.entity.view.DiqumeishiView;

import com.service.DiqumeishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 地区美食
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-06 08:57:49
 */
@RestController
@RequestMapping("/diqumeishi")
public class DiqumeishiController {
    @Autowired
    private DiqumeishiService diqumeishiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiqumeishiEntity diqumeishi,
		HttpServletRequest request){
        EntityWrapper<DiqumeishiEntity> ew = new EntityWrapper<DiqumeishiEntity>();
		PageUtils page = diqumeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diqumeishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiqumeishiEntity diqumeishi, HttpServletRequest request){
        EntityWrapper<DiqumeishiEntity> ew = new EntityWrapper<DiqumeishiEntity>();
		PageUtils page = diqumeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diqumeishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiqumeishiEntity diqumeishi){
       	EntityWrapper<DiqumeishiEntity> ew = new EntityWrapper<DiqumeishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( diqumeishi, "diqumeishi")); 
        return R.ok().put("data", diqumeishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiqumeishiEntity diqumeishi){
        EntityWrapper< DiqumeishiEntity> ew = new EntityWrapper< DiqumeishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( diqumeishi, "diqumeishi")); 
		DiqumeishiView diqumeishiView =  diqumeishiService.selectView(ew);
		return R.ok("查询地区美食成功").put("data", diqumeishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiqumeishiEntity diqumeishi = diqumeishiService.selectById(id);
		diqumeishi.setClicknum(diqumeishi.getClicknum()+1);
		diqumeishi.setClicktime(new Date());
		diqumeishiService.updateById(diqumeishi);
        return R.ok().put("data", diqumeishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiqumeishiEntity diqumeishi = diqumeishiService.selectById(id);
		diqumeishi.setClicknum(diqumeishi.getClicknum()+1);
		diqumeishi.setClicktime(new Date());
		diqumeishiService.updateById(diqumeishi);
        return R.ok().put("data", diqumeishi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        DiqumeishiEntity diqumeishi = diqumeishiService.selectById(id);
        if(type.equals("1")) {
        	diqumeishi.setThumbsupnum(diqumeishi.getThumbsupnum()+1);
        } else {
        	diqumeishi.setCrazilynum(diqumeishi.getCrazilynum()+1);
        }
        diqumeishiService.updateById(diqumeishi);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiqumeishiEntity diqumeishi, HttpServletRequest request){
    	diqumeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diqumeishi);
        diqumeishiService.insert(diqumeishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiqumeishiEntity diqumeishi, HttpServletRequest request){
    	diqumeishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(diqumeishi);
        diqumeishiService.insert(diqumeishi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiqumeishiEntity diqumeishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(diqumeishi);
        diqumeishiService.updateById(diqumeishi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        diqumeishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiqumeishiEntity> wrapper = new EntityWrapper<DiqumeishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = diqumeishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiqumeishiEntity diqumeishi, HttpServletRequest request,String pre){
        EntityWrapper<DiqumeishiEntity> ew = new EntityWrapper<DiqumeishiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = diqumeishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, diqumeishi), params), params));
        return R.ok().put("data", page);
    }


}

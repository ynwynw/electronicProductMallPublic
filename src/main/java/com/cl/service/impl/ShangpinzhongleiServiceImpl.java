package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShangpinzhongleiDao;
import com.cl.entity.ShangpinzhongleiEntity;
import com.cl.service.ShangpinzhongleiService;
import com.cl.entity.view.ShangpinzhongleiView;

@Service("shangpinzhongleiService")
public class ShangpinzhongleiServiceImpl extends ServiceImpl<ShangpinzhongleiDao, ShangpinzhongleiEntity> implements ShangpinzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinzhongleiEntity> page = this.selectPage(
                new Query<ShangpinzhongleiEntity>(params).getPage(),
                new EntityWrapper<ShangpinzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinzhongleiEntity> wrapper) {
		  Page<ShangpinzhongleiView> page =new Query<ShangpinzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShangpinzhongleiView> selectListView(Wrapper<ShangpinzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinzhongleiView selectView(Wrapper<ShangpinzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

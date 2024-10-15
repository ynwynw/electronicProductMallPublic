package com.cl.dao;

import com.cl.entity.ShangpinzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangpinzhongleiView;


/**
 * 商品种类
 * 
 * @author 
 * @email 
 * @date 2024-04-16 16:13:45
 */
public interface ShangpinzhongleiDao extends BaseMapper<ShangpinzhongleiEntity> {
	
	List<ShangpinzhongleiView> selectListView(@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);

	List<ShangpinzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);
	
	ShangpinzhongleiView selectView(@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);
	

}

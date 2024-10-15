package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShangpinzhongleiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShangpinzhongleiView;


/**
 * 商品种类
 *
 * @author 
 * @email 
 * @date 2024-04-16 16:13:45
 */
public interface ShangpinzhongleiService extends IService<ShangpinzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinzhongleiView> selectListView(Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	ShangpinzhongleiView selectView(@Param("ew") Wrapper<ShangpinzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinzhongleiEntity> wrapper);
   	

}


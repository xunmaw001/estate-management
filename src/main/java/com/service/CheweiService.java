package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweiEntity;
import java.util.Map;

/**
 * 车位 服务类
 * @author 
 * @since 2021-04-29
 */
public interface CheweiService extends IService<CheweiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}
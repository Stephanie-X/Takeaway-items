package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.OrderDetail;
import com.itheima.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xsy
 * @date 2022年05月28日 17:16
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}

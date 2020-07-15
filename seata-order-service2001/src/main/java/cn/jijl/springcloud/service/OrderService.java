package cn.jijl.springcloud.service;

import cn.jijl.springcloud.domain.Order;

/**
 * @Author jijl
 * @Since 2020/3/18 21:17
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}

package cn.jijl.springcloud.service;


/**
 * @Author jijl
 * @Since 2020/3/18 22:58
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}

package cn.jijl.springcloud.myhandler;

import cn.jijl.springcloud.entities.CommonResult;
import cn.jijl.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author jijl
 * @Description: 自定义限流处理逻辑
 * @Date 16:03 2020/7/14
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按照客户自定义的Glogal 全局异常处理 ---- 1", new Payment(2020L, "serial003"));
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按照客户自定义的Glogal 全局异常处理 ---- 2", new Payment(2020L, "serial003"));
    }
}

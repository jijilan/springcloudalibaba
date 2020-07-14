package cn.jijl.springcloud.controller;

import cn.jijl.springcloud.entities.CommonResult;
import cn.jijl.springcloud.entities.Payment;
import cn.jijl.springcloud.myhandler.CustomerBlockHandler;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jijl
 * @Date 21:41 2020/7/13
 **/
@RestController
public class RateLimitController {


    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public CommonResult byResource() {
        return new CommonResult(200, "按照资源名称限流测试", new Payment(2020L, "serial001"));
    }

    public CommonResult handleException(BlockException exception) {
        return new CommonResult(444, exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl() {
        return new CommonResult(200, "按照byUrl限流测试", new Payment(2020L, "serial002"));
    }


    /**
     * @return cn.jijl.springcloud.entities.CommonResult
     * @Author jijl
     * @Description: 定义全局的异常返回方法
     * @Date 16:06 2020/7/14
     **/
    //CustomerBlockHandler
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public CommonResult customerBlockHandler() {
        return new CommonResult(200, "按照客户自定义限流测试", new Payment(2020L, "serial003"));
    }
}

package cn.jijl.springcloud.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author jijl
 * @Since 2020/3/18 21:13
 */
@Configuration
@MapperScan({"cn.jijl.springcloud.dao"})
public class MyBatisConfig {


}

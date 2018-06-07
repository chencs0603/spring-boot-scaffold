package com.chencs.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置
 *
 * @author chencs
 * @since 2018/5/3
 */
@Configuration
@MapperScan("com.chencs.dao")
public class MybatisConfig {

}

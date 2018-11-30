package com.dubbo.customer.dubbocustomer.config;/*
 * @author lipei
 *         Date: 2018/11/29
 * @since JDK 1.8
 */

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:consumer.xml"})
public class Config {
}

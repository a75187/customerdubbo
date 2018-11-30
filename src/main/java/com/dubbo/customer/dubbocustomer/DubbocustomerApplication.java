package com.dubbo.customer.dubbocustomer;

import com.demo.api.face.Consumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.xml.bind.SchemaOutputResolver;


@SpringBootApplication
public class DubbocustomerApplication   implements CommandLineRunner {
    @Resource
    private Consumer consumer;
    public static void main(String[] args) {
   /*    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/consumer.xml"});
        context.start();
       Consumer consumer = (Consumer)context.getBean("consumer"); // 获取远程服务代理
        String hello = consumer.hello(); // 执行远程方法
        System.out.println( hello ); // 显示调用结果*/
         SpringApplication.run(DubbocustomerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        String hello = consumer.hello();
        System.out.println(hello);
    }
}

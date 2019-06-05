package com.disp;

import com.disp.common.config.DispProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// 注解式事物
@EnableTransactionManagement
@SpringBootApplication
//@ComponentScan(basePackages = "com.disp.common.config")
//自定义 DispProperties配置
@EnableConfigurationProperties({DispProperties.class})
// 扫描dao层
@MapperScan("com.disp.*.dao")
@EnableSwagger2
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("Success!!!");
	}

}

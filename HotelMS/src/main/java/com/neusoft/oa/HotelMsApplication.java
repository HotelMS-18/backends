package com.neusoft.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.oa.house.mapper","com.neusoft.oa.orders.mapper"})
public class HotelMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMsApplication.class, args);
	}

}

package com.neusoft.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.oa.house.mapper","com.neusoft.oa.orders.mapper","com.neusoft.oa.role.mapper","com.neusoft.oa.user.mapper","com.neusoft.oa.permission.mapper"})
public class HotelMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMsApplication.class, args);
	}

}

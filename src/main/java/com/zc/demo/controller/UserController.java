package com.zc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zc.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	//  @Autowired           不能使用这个注解，因为实现类不在这个工程下面 
	//远程注入
	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody         //表示返回值不会是页面，返回值就是返回的数据               
	public String showName() {
		System.out.println("运行");
		return userService.getName();
		
	}
	
	
}

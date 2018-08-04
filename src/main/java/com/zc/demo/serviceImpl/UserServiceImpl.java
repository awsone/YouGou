package com.zc.demo.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zc.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {

		return "lisi";
	}

}

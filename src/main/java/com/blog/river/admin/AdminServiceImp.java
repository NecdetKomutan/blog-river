package com.blog.river.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	AdminDao adminDao;
	
	@Override
	public Admin findByUsername(String username) {
		return adminDao.findByUsername(username);
	}

	@Override
	public Admin save(Admin admin) {
		return adminDao.save(admin);
	}

}

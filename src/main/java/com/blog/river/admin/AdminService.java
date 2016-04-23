package com.blog.river.admin;

import java.util.List;

public interface AdminService {
	public Admin findByUsername(String username);
	public Admin save(Admin admin);
	public List<Admin> findAll();
}

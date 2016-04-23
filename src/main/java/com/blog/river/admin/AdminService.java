package com.blog.river.admin;

public interface AdminService {
	public Admin findByUsername(String username);
	public Admin save(Admin admin);
}

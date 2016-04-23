package com.blog.river.admin;

import org.springframework.data.repository.CrudRepository;

public interface AdminDao extends CrudRepository<Admin, Long>{
	public Admin findByUsername(String username);
}

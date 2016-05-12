package com.blog.river.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public AdminService getAdminService() {
		return adminService;
	}

	@RequestMapping("/create")
	public @ResponseBody String create() {
		System.log.println("The create function was just called!");
		String userId = "";
		try {
			Admin admin = new Admin("admin", "admin", "ROLE_ADMIN");
			adminService.save(admin);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created";
	}

	@RequestMapping("/getAdmin")
	  public @ResponseBody Admin getAdmin() {
		return adminService.findByUsername("admin");
	  }
	
	@RequestMapping("/listAll")
	  public @ResponseBody List<Admin> listAll() {
		return adminService.findAll();
	  }
}

package com.matrimony.service;

import java.util.List;

import com.matrimony.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> getAllAdmins();

	Admin getAdminById(long id);

	Admin updateAdmin(Admin admin, long id);

}

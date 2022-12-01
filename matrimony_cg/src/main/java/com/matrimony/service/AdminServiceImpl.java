package com.matrimony.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrimony.Exception.ResourceNotFoundException;
import com.matrimony.entity.Admin;
import com.matrimony.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
private AdminRepository adminRepository;
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}


	@Override
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
		
	}


	@Override
	public List<Admin>getAllAdmins(){
		return adminRepository.findAll();
	}
	
	
	@Override
	public Admin getAdminById(long id) {
		
		return adminRepository.findById(id).orElseThrow(() ->
		                new ResourceNotFoundException("Admin","Id",id));
			
		}


	@Override
	public Admin updateAdmin(Admin admin, long id) { 
		Admin adm = adminRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Admin", "Id", id));
		
		adm.setUserName(admin.getUserName());
		adm.setPassword(admin.getPassword());
		
		adminRepository.save(adm);
		return adm;
	}
 		
	

}

package com.matrimony.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimony.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}

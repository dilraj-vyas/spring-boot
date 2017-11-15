package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Device;


public interface DeviceRepository extends JpaRepository<Device, Integer> {
	
}

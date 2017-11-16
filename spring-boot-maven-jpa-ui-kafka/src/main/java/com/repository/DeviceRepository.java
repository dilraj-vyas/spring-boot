package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.model.Device;


public interface DeviceRepository extends JpaRepository<Device, Integer> {

}

package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.to.Device;

public interface RepositoryService extends CrudRepository<Device, String> {

}

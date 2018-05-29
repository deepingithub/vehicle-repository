package com.inventory.control.vehicleinventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleInventoryApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	VehicleDataRestRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(VehicleInventoryApplication.class, args);
	}
}

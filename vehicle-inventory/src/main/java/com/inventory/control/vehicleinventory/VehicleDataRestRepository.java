package com.inventory.control.vehicleinventory;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "vehicles", collectionResourceRel = "vehicles")
public interface VehicleDataRestRepository extends PagingAndSortingRepository<Vehicle, Long>{

}
package com.vyjayanth.flightapp.adminservice.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vyjayanth.flightapp.adminservice.Entity.Discount;



@Repository
public interface DiscountRepository extends CrudRepository<Discount, Integer>{

	
	Boolean existsByCouponcode(String coupon);
	Discount findByCouponcode(String couponcode);
	void deleteByCouponcode(String couponcode);
	
}

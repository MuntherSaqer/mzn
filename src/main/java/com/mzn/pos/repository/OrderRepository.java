package com.mzn.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mzn.pos.model.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}

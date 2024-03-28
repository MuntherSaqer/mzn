package com.mzn.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mzn.pos.model.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

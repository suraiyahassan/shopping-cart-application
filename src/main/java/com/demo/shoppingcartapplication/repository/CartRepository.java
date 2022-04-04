package com.demo.shoppingcartapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.shoppingcartapplication.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
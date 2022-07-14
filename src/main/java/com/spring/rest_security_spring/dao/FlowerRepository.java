package com.spring.rest_security_spring.dao;

import com.spring.rest_security_spring.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}

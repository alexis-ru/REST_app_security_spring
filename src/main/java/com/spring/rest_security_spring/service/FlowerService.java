package com.spring.rest_security_spring.service;

import com.spring.rest_security_spring.entity.Flower;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlowerService {

    public List<Flower> getAllFlowers();

    public void saveFlower(Flower flower);

    public Flower getFlower(int id);

    void updateFlower(Flower flower);

    public void deleteFlower(int id);
}

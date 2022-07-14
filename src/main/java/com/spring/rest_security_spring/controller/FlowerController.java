package com.spring.rest_security_spring.controller;

import com.spring.rest_security_spring.entity.Flower;
import com.spring.rest_security_spring.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> showAllFlowers(){
        List<Flower> allFlowers = flowerService.getAllFlowers();
        return allFlowers;
    }

    @PostMapping("/flowers/add")
    public Flower addNewFlower(@RequestBody Flower flower){
        flower.setId(null);
        flowerService.saveFlower(flower);
        return flower;
    }

    @PutMapping("/flowers/update")
    public Flower update(@RequestBody Flower flower){
        flowerService.updateFlower(flower);
        return flower;
    }

    @GetMapping("/flowers/{id}")
    public Flower getFlower(@PathVariable int id){
        Flower flower = flowerService.getFlower(id);
        return flower;
    }

    @DeleteMapping("/flowers/{id}")
    public String deleteFlower(@PathVariable int id){
        Flower flower = flowerService.getFlower(id);
        if (flower == null) {
            throw new RuntimeException("There is no flower with ID = " + id + " in Database");
        }
        flowerService.deleteFlower(id);
        return "Employee with ID = " + id + " was deleted";
    }

}

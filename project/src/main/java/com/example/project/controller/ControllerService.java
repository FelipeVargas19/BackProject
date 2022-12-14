package com.example.project.controller;


import com.example.project.entity.Services;
import com.example.project.service.ServiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services/")
@CrossOrigin({"*"})
public class ControllerService {

    @Autowired
    private ServiceServices serviceServices;

    @GetMapping
    private ResponseEntity<List<Services>> getAllServices(){
        return ResponseEntity.ok(serviceServices.findAll());
    }
}

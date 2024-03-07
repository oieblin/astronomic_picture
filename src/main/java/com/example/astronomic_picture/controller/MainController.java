package com.example.astronomic_picture.controller;

import com.example.astronomic_picture.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1")
public class MainController {
    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @GetMapping("/{action}")
    public String getAstronomicPic(@PathVariable String action) {
        return service.getAstronomicPic(action);
    }
}

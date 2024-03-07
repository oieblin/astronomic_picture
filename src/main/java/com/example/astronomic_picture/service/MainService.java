package com.example.astronomic_picture.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MainService {
    private static final String NASA_PIC_API_URL = "https://apod.nasa.gov/apod/";

    private final RestTemplate restTemplate;

    public MainService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getAstronomicPic(String action) {
        String url = NASA_PIC_API_URL + action;
        return restTemplate.getForObject(url, String.class);
    }
}

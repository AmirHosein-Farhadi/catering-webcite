package com.dop.onlinecatering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellController {

    @GetMapping("/buy")
    public String buy(){
        return "buy";
    }
}

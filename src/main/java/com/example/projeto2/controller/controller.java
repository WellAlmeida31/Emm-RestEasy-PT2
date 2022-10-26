package com.example.projeto2.controller;

import com.example.projeto2.service.RestService;
import com.example.projeto2.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class controller {

    @Autowired
    private RestService restService;

    @PostMapping("/projeto2post")
    public ResponseEntity<?> projeto2post(@RequestBody String connectionDto){
        return  ok(restService.action(Util.toObject(connectionDto)));
    }

}

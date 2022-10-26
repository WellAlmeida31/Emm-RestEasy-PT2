package com.example.emm.controller;

import com.example.emm.service.RestService;
import com.example.emm.utils.Util;
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

    @PostMapping("/emmpost")
    public ResponseEntity<?> emmPost(@RequestBody String connectionDto){
        return  ok(restService.action(Util.toObject(connectionDto)));
    }

}

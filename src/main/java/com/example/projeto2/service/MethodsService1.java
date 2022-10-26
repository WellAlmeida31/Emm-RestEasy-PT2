package com.example.projeto2.service;

import com.example.projeto2.client.dto.DataDto;
import com.example.projeto2.domain.ClientData;
import org.springframework.stereotype.Service;

@Service
public class MethodsService1 {

    public ClientData clientData(DataDto dto){
        return ClientData.builder()
                .id(1L)
                .age(dto.getAge())
                .name(dto.getName())
                .build();
    }

}

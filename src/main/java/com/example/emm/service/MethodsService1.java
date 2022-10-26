package com.example.emm.service;

import com.example.emm.client.dto.DataDto;
import com.example.emm.domain.ClientData;
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

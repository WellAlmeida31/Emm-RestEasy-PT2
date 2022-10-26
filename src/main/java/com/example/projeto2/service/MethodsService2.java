package com.example.projeto2.service;

import com.example.projeto2.client.dto.DataDto;
import com.example.projeto2.domain.AddressData;
import org.springframework.stereotype.Service;

@Service
public class MethodsService2 {

    public AddressData addressData(DataDto dto){
        return AddressData.builder()
                .id(1L)
                .age(dto.getAge())
                .name(dto.getName())
                .city("Belem")
                .state("Para")
                .street("Rua 2")
                .build();
    }


}

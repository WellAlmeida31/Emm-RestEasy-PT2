package com.example.emm.service;

import com.example.emm.client.dto.DataDto;
import com.example.emm.domain.AddressData;
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

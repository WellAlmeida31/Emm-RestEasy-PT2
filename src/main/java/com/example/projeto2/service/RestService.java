package com.example.projeto2.service;

import com.example.projeto2.client.dto.DataDto;
import com.example.projeto2.domain.dto.ConnectionDto;
import com.example.projeto2.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    @Autowired
    private MethodsService1 methodsService1;

    @Autowired
    private MethodsService2 methodsService2;

    public Object action(ConnectionDto dto){
        switch (dto.getRequestMethod()){
            case method1:
                return methodsService1.clientData(Util.stringToArray(dto.getFields(),DataDto[].class).get(0));

            case method2:
                return methodsService2.addressData(Util.stringToArray(dto.getFields(),DataDto[].class).get(0));

        }
        return new Object();
    }

}

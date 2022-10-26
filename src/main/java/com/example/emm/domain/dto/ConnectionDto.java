package com.example.emm.domain.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@ToString
public class ConnectionDto {

    private HeadersDTO headersDTO;
    private RequestMethod requestMethod;
    private final String fields;
}

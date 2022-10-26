package com.example.projeto2.domain.dto;

import lombok.*;

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

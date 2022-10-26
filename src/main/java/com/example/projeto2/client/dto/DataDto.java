package com.example.projeto2.client.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class DataDto {
    private String name;
    private String age;
}

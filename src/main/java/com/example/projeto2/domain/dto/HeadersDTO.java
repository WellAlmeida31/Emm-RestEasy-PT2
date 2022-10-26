package com.example.projeto2.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeadersDTO {

    private String userAgent;
    private String authorization;
   // private LocalDate requestDate;

}

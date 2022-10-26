package com.example.emm.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HeadersDTO {

    private String userAgent;
    private String authorization;
   // private LocalDate requestDate;

}

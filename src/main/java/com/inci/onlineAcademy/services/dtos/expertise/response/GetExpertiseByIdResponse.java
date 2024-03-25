package com.inci.onlineAcademy.services.dtos.expertise.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetExpertiseByIdResponse {

    private int id;

    private String expertise;

}

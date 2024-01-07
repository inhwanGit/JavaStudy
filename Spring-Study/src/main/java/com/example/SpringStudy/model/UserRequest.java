package com.example.SpringStudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class) //camelcase -> snakecasee 변환
public class UserRequest {

    private String userName;

    private Integer userAge;

    private String userEmail;

    private Boolean isKorean;
}
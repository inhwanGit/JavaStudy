package com.example.SpringStudy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 앞으로 추가할 변수에 대해서 전체 파라미터를 가지는 생성자를 자동으로 만들어줌
@NoArgsConstructor // 기본 생성자를 다루기 위해
public class BookRequset {

    private String name;

    private String number;

    private String category;
}

package com.beyond.basic.b1_hello.domain;

import lombok.*;

@Getter
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든매개변수있는 생성자
//@Data : Getter, Setter, toString메서드 까지 포함하는 어노테이션
public class Hello {
    private String name;
    @Setter // emai;변수에 관한 setter만 생성
    private String email;
    }


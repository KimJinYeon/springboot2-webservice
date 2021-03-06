package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 get 메서드를 생성해줍니다.
@RequiredArgsConstructor // 선언된 모든 final 필드에 포함된 생성자를 생성해줍니다.
public class HelloResponseDto {

    private final String name;
    private final int amount;
}

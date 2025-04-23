package com.samsung.theater.domain;

import com.samsung.theater.domain.enums.CostumeElementType;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CostumeElement {

    private long id;
    private String name;
    private CostumeElementType type;
    private String color;
    private String material;

}

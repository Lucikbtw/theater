package com.samsung.theater.domain;

import com.samsung.theater.domain.enums.CostumeElementType;
import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "costume_element")
public class CostumeElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "Type")
    @Enumerated(value = EnumType.STRING)
    private CostumeElementType type;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

}

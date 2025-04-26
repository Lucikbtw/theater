package com.samsung.theater.rest.controller;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface CostumeElementController {
    List<CostumeElement> getAll();
    CostumeElement getById(long id);
    List<CostumeElement> getCostumeElementByColor(String color);
    List<CostumeElement> getCostumeElementByColorAndType(String color, CostumeElementType type);
    CostumeElement insert(CostumeElement costumeElement);
    CostumeElement update(CostumeElement costumeElement);
    void delete(long id);
}

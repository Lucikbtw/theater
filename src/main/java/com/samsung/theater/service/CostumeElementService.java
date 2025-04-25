package com.samsung.theater.service;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;

import java.util.List;

public interface CostumeElementService {

    List<CostumeElement> getAll();
    CostumeElement getById();
    List<CostumeElement> findByCostumeElementByColor(String color);
    List<CostumeElement> findByCostumeElementByColorAndType(String color, CostumeElementType type);
    CostumeElement insert(CostumeElement costumeElement);
    void delete(long id);

}

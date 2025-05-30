package com.samsung.theater.rest.controller;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;
import com.samsung.theater.service.CostumeElementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CostumeElementCotrollerImpl implements CostumeElementController{

    private final CostumeElementService costumeElementService;

    @GetMapping(path = "/costume-element")
    @Override
    public List<CostumeElement> getAll() {
        return costumeElementService.getAll();
    }

    @GetMapping(path  = "/costume-element/{c_id}")
    @Override
    public CostumeElement getById(@PathVariable(name = "c_id") long id) {
        return costumeElementService.getById(id);
    }

    @Override
    public List<CostumeElement> getCostumeElementByColor(String color) {
        return costumeElementService.getCostumeElementByColor(color);
    }

    @Override
    public List<CostumeElement> getCostumeElementByColorAndType(String color, CostumeElementType type) {
        return costumeElementService.getCostumeElementByColorAndType(color, type);
    }

    @Override
    public CostumeElement insert(CostumeElement costumeElement) {
        return costumeElementService.insert(costumeElement);
    }

    @Override
    public CostumeElement update(CostumeElement costumeElement) {
        return costumeElementService.update(costumeElement);
    }

    @Override
    public void delete(long id) {
        costumeElementService.delete(id);
    }


}

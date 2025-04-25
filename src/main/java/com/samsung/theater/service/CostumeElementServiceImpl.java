package com.samsung.theater.service;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;
import com.samsung.theater.repository.CostumeElementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CostumeElementServiceImpl implements CostumeElementService {
    private final CostumeElementRepository repository;

    @Override
    public List<CostumeElement> getAll() {
        return List.of();
    }

    @Override
    public CostumeElement getById() {
        return null;
    }

    @Override
    public List<CostumeElement> getCostumeElementByColor(String color) {
        return List.of();
    }

    @Override
    public List<CostumeElement> getCostumeElementByColorAndType(String color, CostumeElementType type) {
        return List.of();
    }

    @Override
    public CostumeElement insert(CostumeElement costumeElement) {
        return null;
    }

    @Override
    public CostumeElement update(CostumeElement costumeElement) {
        return null;
    }

    @Override
    public void delete(long id) {

    }



}

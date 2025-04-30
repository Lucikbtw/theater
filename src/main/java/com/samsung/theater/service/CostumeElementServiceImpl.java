package com.samsung.theater.service;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;
import com.samsung.theater.exceptions.CostumeElementAlreadyExistsExcepthion;
import com.samsung.theater.exceptions.CostumeElementNotFoundException;
import com.samsung.theater.exceptions.IdNotValidException;
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
    public CostumeElement getById(long id) {
        if(id <= 0) throw new IdNotValidException("id must be positive");
        return repository.findById(id).orElseThrow(() -> new CostumeElementNotFoundException("Costume element with id " + id + " was not found"));
    }

    @Override
    public List<CostumeElement> getCostumeElementByColor(String color) {
        return repository.findCostumeElementByColor(color);
    }

    @Override
    public List<CostumeElement> getCostumeElementByColorAndType(String color, CostumeElementType type) {
        return repository.findCostumeElementByColorAndType(color, type);
    }

    @Override
    public CostumeElement insert(CostumeElement costumeElement) {
        long id = costumeElement.getId();
        if (id != 0){
            if(repository.count() > costumeElement.getId())
                throw new CostumeElementAlreadyExistsExcepthion("costume element with id " + id + "already exists");
            throw new IdNotValidException("Id must be zero!");
        }
        return repository.save(costumeElement);
    }

    @Override
    public CostumeElement update(CostumeElement costumeElement) {
        if(costumeElement.getId() <= 0) throw new IdNotValidException("id must be positive");
        if(repository.existsById(costumeElement.getId())){
            throw new CostumeElementNotFoundException("Costume element with id " + costumeElement.getId() + " was not found");
        }
        return repository.save(costumeElement);
    }

    @Override
    public void delete(long id) {
        if(id <= 0) throw new IdNotValidException("id must be positive");
        if(!repository.existsById(id)){
            throw new CostumeElementNotFoundException("Costume element with id " + id + " was not found");
        }
        repository.deleteById(id);
    }



}

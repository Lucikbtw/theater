package com.samsung.theater.repository;

import com.samsung.theater.domain.CostumeElement;
import com.samsung.theater.domain.enums.CostumeElementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumeElementRepository extends JpaRepository<CostumeElement, Long> {
    List<CostumeElement> findByCostumeElementByColor(String color);
    List<CostumeElement> findByCostumeElementByColorAndType(String color, CostumeElementType type);
}

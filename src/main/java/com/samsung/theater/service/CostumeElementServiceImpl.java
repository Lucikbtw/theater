package com.samsung.theater.service;

import com.samsung.theater.repository.CostumeElementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CostumeElementServiceImpl implements CostumeElementService {
    private final CostumeElementRepository repository;




}

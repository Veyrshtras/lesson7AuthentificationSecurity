package com.example.lesson7authentificationsecurity.service.impl;

import com.example.lesson7authentificationsecurity.repository.CategoryRepository;
import com.example.lesson7authentificationsecurity.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

}

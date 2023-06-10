package mate.academy.springboot.datajpa.service;

import mate.academy.springboot.datajpa.model.Category;

public interface CategoryService {
    Category create(Category category);

    Category findById(Long id);

    void delete(Long id);

    Category update(Category category);

}
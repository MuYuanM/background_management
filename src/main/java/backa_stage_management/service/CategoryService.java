package backa_stage_management.service;

import java.util.List;

import backa_stage_management.pojo.Category;

public interface CategoryService{
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
	

package chapter16.practice.service;

import java.util.List;

import chapter16.practice.entity.Category;
import chapter16.practice.entity.item;

public interface Manageable {
	List<item> searchByCategory(Category category);
}

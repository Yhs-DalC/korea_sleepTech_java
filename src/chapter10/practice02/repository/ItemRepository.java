package chapter10.practice02.repository;

import java.util.Set;

import chapter10.practice02.entity.Item;

public interface ItemRepository {
	
	//Ctrl + shift + o: 자동 임포트
	void addItem(Item item);
	void removeItem(String itemId);
	Item findById(String itemId);
	Set<Item> findAll();
}

package ua.step.example.test.services;

import java.util.List;

import ua.step.example.test.entity.Todo;

public interface TodoService {
	List<Todo> getAll();
	Todo getById(Long id);
	void save(Todo todo);
}
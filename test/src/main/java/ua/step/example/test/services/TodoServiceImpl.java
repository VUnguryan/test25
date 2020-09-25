package ua.step.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.step.example.test.entity.Todo;
import ua.step.example.test.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoRepository repo;
	
	@Override
	public List<Todo> getAll() {
		return repo.findAll();
	}

	@Override
	public Todo getById(Long id) {
		Todo todo = new Todo();
		return repo.findById(id).orElse(todo);
	}

	@Override
	public void save(Todo todo) {
		repo.save(todo);
	}
}
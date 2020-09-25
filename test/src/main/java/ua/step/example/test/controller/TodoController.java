package ua.step.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ua.step.example.test.entity.Todo;
import ua.step.example.test.services.TodoService;

@Controller
public class TodoController {
	@Autowired
	private TodoService service;

	@GetMapping ("/")
	public String getAllTodo(Model model) {
		model.addAttribute("todos", service.getAll());
		return "todos";
	}
	
	@GetMapping ("/todo/{id}")
	public String getTodo(@PathVariable Long id, Model model) {
		model.addAttribute("todo", service.getById(id));
		return "todo";
	}
	
	@PostMapping("/todo/add")
	public String addTodo(@ModelAttribute Todo todo) {
		service.save(todo);
		return "redirect:/";
	}
}
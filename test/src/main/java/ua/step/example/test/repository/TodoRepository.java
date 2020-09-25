package ua.step.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.step.example.test.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
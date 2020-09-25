package ua.step.example.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import ua.step.example.test.entity.Todo;
import ua.step.example.test.services.TodoService;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("dev")
class TodoControllerTest {
	@Autowired 
	private MockMvc mockMvc;
	
	@MockBean
	private TodoService service;
	
	/*
	 * @Test void findAll_ShouldAddTodoEntriesToModelAndRenderTodoListView() throws
	 * Exception { Todo first = Todo.builder() .todoId(1L) .name("First Todo")
	 * .plannedFor(LocalDate.now().plusDays(1)) .build(); Todo second =
	 * Todo.builder() .todoId(2L) .name("Second Todo") .done(true)
	 * .plannedFor(LocalDate.now().minusDays(1)) .build(); // делаем заглушку для
	 * метода сервиса when(service.getAll()).thenReturn(Arrays.asList(first,
	 * second));
	 * 
	 * mockMvc.perform(get("/")).andDo(print()) .andExpect(status().isOk())
	 * .andExpect(view().name("todos")) .andExpect(model().size(1))
	 * .andExpect(model().attributeExists("todos")) .andReturn(); }
	 */
	
	@Test
	void addTodo() {
		
	}
}
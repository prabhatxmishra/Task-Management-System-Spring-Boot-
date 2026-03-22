package com.in28minutes.spring_boot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static int todoCount=0;
    static {
        todos.add(new Todo(todoCount++, "Prabhat", "Learn AWS right nowwwww",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todoCount++, "Prabhat", "Devops Leanoiiaiaiia",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(todoCount++, "Prabhat", "Java Springboot",
                LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
    	Predicate<? super Todo> predicate = todo->todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }
    
	public void addTodo(String username, String description, LocalDate targetDate, boolean done)
	{
		todos.add(new Todo(todoCount++, username, description, targetDate, done));
	}
	
	public void deleteTodoById(int id)
	{
		//todo.getid()==id
		Predicate<? super Todo> predicate = todo->todo.getId()==id;
		todos.removeIf(predicate);
	}

	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo->todo.getId()==id;
		Todo todo=todos.stream().filter(predicate).findFirst().get();
		return todo ;
	}

	public void update(@Valid Todo todo) {
		// TODO Auto-generated method stub
		deleteTodoById(todo.getId());
		todos.add(todo);
	}
}

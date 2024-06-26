package br.com.todo.controller;

import br.com.todo.entity.Todo;
import br.com.todo.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    List<Todo> list() {
        return todoService.list();
    }

    @PostMapping
    List<Todo> create(@Valid @RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping
    List<Todo> update(@Valid @RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("/{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}

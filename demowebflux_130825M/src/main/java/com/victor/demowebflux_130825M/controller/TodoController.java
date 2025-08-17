package com.victor.demowebflux_130825M.controller;

import com.victor.demowebflux_130825M.model.Todo;
import com.victor.demowebflux_130825M.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    @GetMapping
    public Flux<Todo> getAll() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Todo> get(@PathVariable String id) {
        return todoService.findById(id);
    }

    @PostMapping
    public Mono<Todo> create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return todoService.findById(id)
    //               .flatMap(todo -> todoService.delete(todo));
                .flatMap(todoService::delete);
    }
}

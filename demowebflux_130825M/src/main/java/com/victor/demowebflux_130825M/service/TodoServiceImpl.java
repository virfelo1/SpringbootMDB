package com.victor.demowebflux_130825M.service;

import com.victor.demowebflux_130825M.model.Todo;
import com.victor.demowebflux_130825M.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl extends TodoService {

    private final TodoRepository todoRepository;

    @Override
    public Flux<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Mono<Todo> findById(String id) {
        return todoRepository.findById(id);
    }

    @Override
    public Mono<Void> delete(Todo todo) {
        return todoRepository.delete(todo);
    }

    @Override
    public Mono<Todo> create(Todo todo) {
        return todoRepository.save(todo);
    }
}

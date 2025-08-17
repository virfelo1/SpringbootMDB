package com.victor.demowebflux_130825M.service;

import com.victor.demowebflux_130825M.model.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public abstract class TodoService {
    public abstract Flux<Todo> findAll();
    public abstract Mono<Todo> findById(String id);
    public abstract Mono<Void> delete(Todo todo);
    public abstract Mono<Todo> create(Todo todo);
}

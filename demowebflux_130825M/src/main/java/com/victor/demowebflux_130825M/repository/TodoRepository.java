package com.victor.demowebflux_130825M.repository;

import com.victor.demowebflux_130825M.model.Todo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TodoRepository extends ReactiveMongoRepository <Todo, String> {
}

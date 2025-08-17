package com.victor.demowebflux_130825M.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document // documento que va a persistir en la BD mongo db
public class Todo {
    @Id
    private String id;         //atributos
    private String name;
    private boolean completed;
}

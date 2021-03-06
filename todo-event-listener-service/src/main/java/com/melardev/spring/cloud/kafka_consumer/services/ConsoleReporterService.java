package com.melardev.spring.cloud.kafka_consumer.services;

import com.melardev.spring.cloud.kafka_consumer.models.Todo;
import org.springframework.stereotype.Service;

@Service("console")
public class ConsoleReporterService implements IReporterService {

    @Override
    public void reportTodoCreated(Todo todo) {
        System.out.printf("Todo created; Title=%s; Description=%s, CreatedAt=%s, UpdatedAt=%s",
                todo.getTitle(), todo.getDescription(), todo.getCreatedAt(), todo.getUpdatedAt());
    }
}

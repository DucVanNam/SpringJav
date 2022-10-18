package com.example.javspring.service.impl;

import com.example.javspring.model.ToDo;
import com.example.javspring.repository.ToDoRepository;
import com.example.javspring.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ToDoServiceImpl implements ToDoService {
    private final ToDoRepository toDoRepository;
    @Override
    public ToDo update(Long id, ToDo toDo) {
        Optional<ToDo> entity = toDoRepository.findById(id);
        ToDo update = entity.get();
        update.setCode(toDo.getCode());
        update.setName(toDo.getName());
        update.setAddress(toDo.getAddress());
        update.setPhone(toDo.getPhone());
        toDoRepository.save(update);
        return update;
    }
}

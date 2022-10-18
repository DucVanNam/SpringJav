package com.example.javspring.controller;

import com.example.javspring.model.ToDo;
import com.example.javspring.model.requestDTO.TodoRequest;
import com.example.javspring.repository.ToDoRepository;
import com.example.javspring.service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class ToDoController {
    private final ToDoRepository toDoRepository;
    private final ToDoService toDoService;

    @GetMapping("/getlisttodo")
    public List<ToDo> getTodoTaskList() {
        return toDoRepository.findAll();
    }

    @PostMapping("/create")
    public ToDo create(@RequestBody @Valid TodoRequest toDo) {
        String add = toDo.getAddress();
        String pho = toDo.getPhone();
        String name = toDo.getName();
        return toDoRepository.save(TodoRequest.fromDto(toDo));
    }

    @GetMapping("/getbyid/{id}")
    public Optional<ToDo> getById(@PathVariable(name = "id")Long id) {
        return toDoRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    public ToDo update(@PathVariable(name = "id")Long id, ToDo toDo) {
         return toDoService.update(id,toDo);
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable(name = "id")Long id) {
         toDoRepository.deleteById(id);
    }

}

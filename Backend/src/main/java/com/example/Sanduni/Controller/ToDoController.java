package com.example.Sanduni.Controller;

import com.example.Sanduni.Model.ToDo;
import com.example.Sanduni.Repository.ToDoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/api/todo")
    @CrossOrigin(origins = "http://localhost:5173")

    public class ToDoController {
        private final ToDoRepository toDoRepository;

        public ToDoController(ToDoRepository toDoRepository)
        {
            this.toDoRepository=toDoRepository;
        }

        @GetMapping
        public List<ToDo>getAllTask(){
            return toDoRepository.findAll();
        }

        @PostMapping
    public ToDo addTask (@RequestBody ToDo toDo){
            return toDoRepository.save(toDo);
        }

        @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
            toDoRepository.deleteById(id);
        }
}

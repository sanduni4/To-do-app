package com.example.Sanduni.Repository;

import com.example.Sanduni.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}

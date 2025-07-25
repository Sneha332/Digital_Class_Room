package com.teamgreen.classroom.controller;

import com.teamgreen.classroom.entity.Classroom;
import com.teamgreen.classroom.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    @Autowired
    private ClassroomRepository classroomService;

    @GetMapping("/user/{userId}")
    public List<Classroom> getClassroomsByUserId(@PathVariable Long userId) {
        return classroomService.findByUserIdContaining(userId);
    }
}

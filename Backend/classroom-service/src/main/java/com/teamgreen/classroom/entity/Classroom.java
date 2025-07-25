package com.teamgreen.classroom.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String coverPhotoPath;

    @ElementCollection
    @CollectionTable(name = "classroom_users", joinColumns = @JoinColumn(name = "classroom_id"))
    @Column(name = "user_id")
    List<Long> userId;
}

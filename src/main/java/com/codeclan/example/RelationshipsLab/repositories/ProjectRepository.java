package com.codeclan.example.RelationshipsLab.repositories;

import com.codeclan.example.RelationshipsLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

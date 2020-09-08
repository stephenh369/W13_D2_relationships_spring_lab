package com.codeclan.example.RelationshipsLab.repositories;

import com.codeclan.example.RelationshipsLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

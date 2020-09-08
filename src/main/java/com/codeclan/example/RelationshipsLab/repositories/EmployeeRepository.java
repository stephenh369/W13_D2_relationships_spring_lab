package com.codeclan.example.RelationshipsLab.repositories;

import com.codeclan.example.RelationshipsLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

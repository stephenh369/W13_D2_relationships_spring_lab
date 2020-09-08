package com.codeclan.example.RelationshipsLab;

import com.codeclan.example.RelationshipsLab.models.Department;
import com.codeclan.example.RelationshipsLab.models.Employee;
import com.codeclan.example.RelationshipsLab.models.Project;
import com.codeclan.example.RelationshipsLab.repositories.DepartmentRepository;
import com.codeclan.example.RelationshipsLab.repositories.EmployeeRepository;
import com.codeclan.example.RelationshipsLab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RelationshipsLabApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Department department = new Department("Department 1");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jack", "Sparrow", 32, department);
		employeeRepository.save(employee1);
	}

	@Test
	public void addPiratesAndRaids(){
		Department department = new Department("Department 1");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jack", "Sparrow", 32, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Tortuga", 100);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}

}

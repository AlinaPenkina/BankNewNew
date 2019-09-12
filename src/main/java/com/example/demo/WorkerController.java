package com.example.demo;

import category.Category;
import com.example.demo.service.CategoryService;
import com.example.demo.service.EmployeeService;
import com.example.demo.worker.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class WorkerController {
    public final EmployeeService employeeService;
    public final CategoryService categoryService;

    WorkerController(EmployeeService employeeService, CategoryService categoryService) {
        this.employeeService = employeeService;
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello!";
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable Long id) {

        return employeeService.getById(id);
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PostMapping("/category/save")
    public Category save(@RequestBody Category category) {
        return categoryService.save(category);
    }
}
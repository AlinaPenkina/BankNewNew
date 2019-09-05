package com.example.demo;

import com.example.demo.repository.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class SaveEmployeeTest {

    private EmployeeRepository employeeRepository = Mockito.mock(EmployeeRepository.class);

    @BeforeEach
    void initUseCase(){

    }
}

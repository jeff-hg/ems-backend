package io.github.jeff_hg.ems.service;

import io.github.jeff_hg.ems.dto.EmployeeDto;

import java.util.List;

/**
 * Should receive a employee DTO from controller, save to DB, then return the modified dto (with generated ID)
 */
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long Id);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee);
    void deleteEmployee(Long employeeId);
}

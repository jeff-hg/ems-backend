package io.github.jeff_hg.ems.service;

import io.github.jeff_hg.ems.dto.EmployeeDto;

/**
 * Should receive a employee DTO from controller, save to DB, then return the modified dto (with generated ID)
 */
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long Id);
}

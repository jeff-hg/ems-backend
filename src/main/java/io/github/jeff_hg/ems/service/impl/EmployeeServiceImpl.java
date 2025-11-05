package io.github.jeff_hg.ems.service.impl;

import io.github.jeff_hg.ems.dto.EmployeeDto;
import io.github.jeff_hg.ems.entity.Employee;
import io.github.jeff_hg.ems.exception.ResourceNotFoundException;
import io.github.jeff_hg.ems.mapper.EmployeeMapper;
import io.github.jeff_hg.ems.repository.EmployeeRepository;
import io.github.jeff_hg.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    // Saves new employee given a DTO then returns the saved employee data
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee with the given id does not exist: " + employeeId));

        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}

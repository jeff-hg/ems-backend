package io.github.jeff_hg.ems.repository;

import io.github.jeff_hg.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Note, Spring Data JPA automatically creates a default implementation for any interface that extends JpaRepository
 * This implementation class is called SimpleJpaRepository
 *  All its methods are annotated with @Repository and @Transactional
 *  What @Transactional means is the operations in the method will either succeed or fail together
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

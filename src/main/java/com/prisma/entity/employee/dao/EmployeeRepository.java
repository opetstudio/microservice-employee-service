package com.prisma.entity.employee.dao;

import java.util.List;

import com.prisma.entity.employee.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // List<Employee> findByLocationNear(Point location, Distance distance);
    List<Employee> findByDepartmentId(Long departmentId);
    List<Employee> findByOrganizationId(Long organizationId);
}
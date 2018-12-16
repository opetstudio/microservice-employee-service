package com.prisma.entity.employee.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.prisma.entity.employee.model.TbEmployee;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;


// @Repository
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository extends PagingAndSortingRepository<TbEmployee, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // @Override
    // default Optional<TbEmployee> findById(String id) {
    //     return null;
    // }
    // List<Employee> findByLocationNear(Point location, Distance distance);
    // List<Employee> findByDepartmentId(Long departmentId);
    // List<Employee> findByOrganizationId(Long organizationId);
    // List<Employee> findByCreatedbyOrderByCreatedonAsc(@Param("createdby") String createdby);
    // List<Employee> findByCreatedbyOrderByCreatedonDesc(@Param("createdby") String createdby);
}
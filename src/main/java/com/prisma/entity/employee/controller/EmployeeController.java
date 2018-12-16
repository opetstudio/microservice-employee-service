package com.prisma.entity.employee.controller;

import java.util.List;
import java.util.Optional;

import com.prisma.entity.employee.dao.EmployeeRepository;
import com.prisma.entity.employee.model.TbEmployee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
 private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
 
 @Autowired
 EmployeeRepository repository;

 @PostMapping("/create")
 public TbEmployee add(@RequestBody TbEmployee employee) {
    LOGGER.info("Employee add: {}", employee);
    return repository.save(employee);
 }
 @GetMapping("/read/{id}")
 public Optional<TbEmployee> findById(@PathVariable("id") String id) {
  LOGGER.info("Employee find: id={}", id);
  return repository.findById(id);
//   return repository.findByIdid)
 }
 @GetMapping("/read-all")
 public Iterable<TbEmployee> readAll() {
   Iterable<TbEmployee> all = repository.findAll(Sort.by("email"));
   all.forEach(System.out::println);
  return all;
 }
//  @GetMapping("/department/{departmentId}")
//  public List findByDepartment(@PathVariable("departmentId") Long departmentId) {
//   LOGGER.info("Employee find: departmentId={}", departmentId);
//   // return repository.findByDepartmentId(departmentId);
//   return repository.findByDepartmentId(departmentId);
//  }
//  @GetMapping("/organization/{organizationId}")
//  public List findByOrganization(@PathVariable("organizationId") Long organizationId) {
//   LOGGER.info("Employee find: organizationId={}", organizationId);
//   return repository.findByOrganizationId(organizationId);
//  }
}
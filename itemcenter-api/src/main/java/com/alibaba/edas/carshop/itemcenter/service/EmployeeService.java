package com.alibaba.edas.carshop.itemcenter.service;

import com.alibaba.edas.carshop.itemcenter.model.Employee;

import java.util.List;

/**
 * @author wangzi
 * @date 18/9/13 上午11:12.
 */
public interface EmployeeService {
    public List<Employee> findEmployeeByPojo(Employee po);
}

package com.alibaba.edas.carshop.itemcenter.service;

import com.alibaba.edas.carshop.itemcenter.dao.EmployeeDao;
import com.alibaba.edas.carshop.itemcenter.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzi
 * @date 18/9/13 上午11:12.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> findEmployeeByPojo(Employee po) {
        return employeeDao.findEmployeeByPojo(po);
    }

    @Override
    public Employee findEmployeeByKey(Employee po) {
        return employeeDao.findEmployeeByKey(po);
    }

    @Override
    public void insert(Employee po) {
        employeeDao.insert(po);
    }

    @Override
    public void delete(Employee po) {
        employeeDao.delete(po);
    }

    @Override
    public void update(Employee po) {
        employeeDao.update(po);
    }
}

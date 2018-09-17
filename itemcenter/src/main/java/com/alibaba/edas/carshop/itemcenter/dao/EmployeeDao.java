package com.alibaba.edas.carshop.itemcenter.dao;

import com.alibaba.edas.carshop.itemcenter.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangzi
 * @date 18/1/3 下午3:43.
 */
@Repository
public interface EmployeeDao {
    List<Employee> findEmployeeByPojo(Employee po);

    Employee findEmployeeByKey(Employee po);
}

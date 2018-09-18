package com.alibaba.edas.carshop.detail.web;

import com.alibaba.edas.carshop.itemcenter.model.Employee;
import com.alibaba.edas.carshop.itemcenter.model.Item;
import com.alibaba.edas.carshop.itemcenter.service.EmployeeService;
import com.alibaba.edas.carshop.itemcenter.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangzi
 * @date 18/9/13 上午11:26.
 */
@RestController
@RequestMapping(value = "/EmployeeController")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ItemService itemService;

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public ItemService getItemService() {
        return itemService;
    }

    @RequestMapping(value = "/test")
    public void test() {
        System.out.println("test!!!");
    }

    @RequestMapping(value = "/test02")
    public void fun() {
        Item itemById = itemService.getItemById(100);
        System.out.println(itemById);
    }

    @RequestMapping(value = "findEmployeeByPojo")
    public void findEmployeeByPojo() {
        System.out.println(123123123);
        List<Employee> employeeByPojo = employeeService.findEmployeeByPojo(null);
        for (Employee e : employeeByPojo) {
            System.out.println(e);
        }
    }

    @RequestMapping(value = "findEmployeeByKey")
    public void findEmployeeByKey() {
        Employee employee = new Employee();
        employee.setId(2);
        Employee employeeByKey = employeeService.findEmployeeByKey(employee);
        System.out.println(employeeByKey);
    }

    @RequestMapping(value = "insert")
    public void insert(Employee employee) {
        employeeService.insert(employee);
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public void delete(Employee employee) {
        employeeService.delete(employee);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public void update(Employee employee) {
        employeeService.update(employee);
    }
}

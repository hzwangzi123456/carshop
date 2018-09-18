package test;

import com.alibaba.edas.carshop.itemcenter.model.Employee;
import com.alibaba.edas.carshop.itemcenter.service.EmployeeService;
import com.alibaba.edas.carshop.itemcenter.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-*.xml"})
public class testClass01 {

    @Autowired
    private EmployeeService employeeServiceImpl;

    @Test
    public void test() {
        List<Employee> employeeByPojo = employeeServiceImpl.findEmployeeByPojo(null);
        for (Employee e : employeeByPojo) {
            System.out.println(e);
        }
    }

    @Test
    public void findEmployeeByKeyTest() {
        Employee employee = new Employee();
        employee.setId(2);
        Employee employeeByKey = employeeServiceImpl.findEmployeeByKey(employee);
        System.out.println(employeeByKey);
    }

    @Test
    public void insertTest() {
        Employee employee = new Employee();
        employee.setId(3);
        employee.setName("wz");
        employee.setDepartment("数梦");
        employee.setPassword("123");
        employee.setUsername("hzwangzi");
        employeeServiceImpl.insert(employee);
    }

    @Test
    public void deleteTest() {
        Employee employee = new Employee();
        employee.setId(1);
        employeeServiceImpl.delete(employee);
    }

    @Test
    public void updateTest() {
        Employee employee = new Employee();
        employee.setId(2);
        Employee employeeByKey = employeeServiceImpl.findEmployeeByKey(employee);
        employeeByKey.setUsername("wzwzwzwz");
        employeeByKey.setDepartment("hangzhou");
        employeeServiceImpl.update(employeeByKey);
    }
}

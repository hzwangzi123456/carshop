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
    private EmployeeServiceImpl employeeServiceImpl;

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

}

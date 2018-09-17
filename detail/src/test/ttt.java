import com.alibaba.edas.carshop.detail.web.EmployeeController;
import com.alibaba.edas.carshop.itemcenter.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wangzi
 * @date 18/9/17 下午2:39.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/springmvc.xml"})
public class ttt {
    @Autowired
    private EmployeeController employeeController;

    @Test
    public void test() {

    }
}

package facefeel;

import com.taobao.model.UserModel;
import com.taobao.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 获取用户列表数据测试类
 * @author FaceFeel
 * @Created 2018-01-31 16:10
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:spring-context.xml")
public class MultiTest {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        List<UserModel> userList = userService.getUserList();
        System.err.println(userList);
    }
}

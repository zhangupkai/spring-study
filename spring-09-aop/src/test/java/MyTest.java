import org.example.service.UserService;
import org.example.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 21:28
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 动态代理代理的是接口
        // TODO 这样写是错的 UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}

import org.example.config.MyConfig;
import org.example.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/19 18:31
 */

public class MyTest {
    public static void main(String[] args) {
        // 注解获得上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());
    }
}

import org.example.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 19:28
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        // 默认单例 user == user1

        System.out.println(user.toString());
    }
}

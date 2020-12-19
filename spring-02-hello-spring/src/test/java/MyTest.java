import org.example.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 18:59
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取Spring上下文对象
        // AnnotationConfigApplicationContext() 从注解获取
        // ClassPathXmlApplicationContext(".xml") 从配置文件获取
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello =  (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test(){
        //创建spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    }
}

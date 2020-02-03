import com.ping.Service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        IAccountService as=context.getBean("accountService",IAccountService.class);
         as.saveAccount();
         as.deleteAccount();
         as.upDateAccount(2);
    }
}

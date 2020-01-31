import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: edison
 * @Date: 2020/1/31 10时29分
 * @Description:
 */
public class test2 {

    @Test
    public void test1() throws SQLException {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("conf/spring-dao.xml");
        ComboPooledDataSource bean = ac.getBean("dataSource", ComboPooledDataSource.class);
        System.out.println(bean);
        Connection connection = bean.getConnection();
        System.out.println(connection);

    }
}

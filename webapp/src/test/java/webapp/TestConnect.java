package webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.base.pojo.User;
import com.base.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContextwithmybatis.xml"})
public class TestConnect {

  @Autowired
  JdbcTemplate jdbcTemplate;
  
  @Test
  public void test() {
    
    System.out.println(jdbcTemplate);
  //启动IoC容器
    String sql="select count(*) from test_db";
    int count= jdbcTemplate.queryForObject(sql, Integer.class);
    System.out.println(count);
  }
  
  @Test
  public void test2() throws SQLException {
    Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/web?useSSL=false&useUnicode=true&characterEncoding=UTF-8", "root", "ad07907*");
  }
}

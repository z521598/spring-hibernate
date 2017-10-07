import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.langshiquan.User;

/**
 * Created by langshiquan on 17/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringHibernateTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testHello() {
        Session session = sessionFactory.openSession();
        User user = new User();
        user.setName("zdh");
        user.setGender("woman");
        session.save(user);
    }
}

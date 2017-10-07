import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.langshiquan.User;
import com.baidu.langshiquan.UserDao;

/**
 * Created by langshiquan on 17/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringHibernateTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    @Autowired
    @Qualifier("userDaoImpl2")
    private UserDao userDao2;

    @Test
    public void testSessionFactoryOpenSession() {
        Session session = sessionFactory.openSession();
        User user = new User();
        user.setName("zdh");
        user.setGender("woman");
        session.save(user);
    }

    // TODO
    @Test
    public void testHibernateTemplate() {
        User user = new User();
        user.setName("zdh");
        user.setGender("woman");
        userDao2.save(user);
    }
}

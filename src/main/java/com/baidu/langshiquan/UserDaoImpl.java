package com.baidu.langshiquan;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by langshiquan on 17/10/8.
 */
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public void save(User user) {
        getHibernateTemplate().save(user);
    }
}

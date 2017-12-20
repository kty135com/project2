package cn.rzpt.dao;

import cn.rzpt.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TestDao {

    @Autowired
    HibernateTemplate ht;

    public void insert(Test t){
        ht.save(t);
    }
}

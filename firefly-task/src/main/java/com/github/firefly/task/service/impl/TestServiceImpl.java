package com.github.firefly.task.service.impl;

import com.github.firefly.task.entity.User;
import com.github.firefly.task.service.TestService;
import org.jinq.jooq.JinqJooqContext;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.impl.SchemaImpl;
import org.jooq.impl.TableImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by say on 8/11/16.
 */
@Repository
public class TestServiceImpl implements TestService {

    @Autowired
    private DSLContext dslContext;

//    @Autowired
//    private Schema schema;

    //    @PersistenceContext
//    private EntityManager entityManager;
//
//
//    public Collection<User> findByName(String name) {
//        JinqJPAStreamProvider streams =
//                new JinqJPAStreamProvider(entityManager.getMetamodel());
//        return streams.streamAll(entityManager, User.class)
//                .where(c -> c.getUsername().equals(name))
//                .toList();
//    }

    public User get() {
//        System.out.println(this.schema);
        JinqJooqContext jinq = JinqJooqContext.using(dslContext, new SchemaImpl(""));
        System.out.println(jinq);
        List<User> fetch  = jinq.from(new TableImpl<User>("user")).selectAll().toList();
//        Result<Record> fetch = this.dslContext.selectFrom(DSL.table("user")).fetch();
        for (Record record : fetch) {
            System.out.println(record);
            System.out.println(record.getValue("username"));
        }
        System.out.println(dslContext);
        return null;
    }
}

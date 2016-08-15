package com.github.firefly.task.dao;

import com.github.firefly.task.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by say on 8/10/16.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
}

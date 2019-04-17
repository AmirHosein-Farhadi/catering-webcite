package com.dop.onlinecatering.repositories;

import com.dop.onlinecatering.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Override
    List<User> findAll();

    User findByEmail(String email);
}

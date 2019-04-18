package com.dop.onlinecatering.repositories;

import com.dop.onlinecatering.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Override
    List<User> findAll();
    Optional<User> findByUsername(String username);
}

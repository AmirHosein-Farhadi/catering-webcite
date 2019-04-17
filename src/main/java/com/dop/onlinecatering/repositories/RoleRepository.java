package com.dop.onlinecatering.repositories;

import com.dop.onlinecatering.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(String name);
}

package com.dop.onlinecatering.repositories;

import com.dop.onlinecatering.model.Privilege;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {
    Privilege findByName(String name);
}

package com.dop.onlinecatering.repositories;

import com.dop.onlinecatering.model.SubCity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCityRepository extends CrudRepository<SubCity, Long> {
}

package com.caichihua.pizzeria.persistencia.repository;

import com.caichihua.pizzeria.persistencia.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRespository extends ListCrudRepository<PizzaEntity,Integer> {
}

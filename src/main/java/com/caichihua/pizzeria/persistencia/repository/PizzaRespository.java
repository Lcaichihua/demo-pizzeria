package com.caichihua.pizzeria.persistencia.repository;

import com.caichihua.pizzeria.persistencia.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface PizzaRespository extends ListCrudRepository<PizzaEntity,Integer> {

    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();
    PizzaEntity findAllByAvailableTrueAndNameIgnoreCase(String name);
}

package com.caichihua.pizzeria.persistencia.repository;

import com.caichihua.pizzeria.persistencia.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderEntity,Integer> {
}

package com.caichihua.pizzeria.service;


import com.caichihua.pizzeria.persistencia.entity.PizzaEntity;
import com.caichihua.pizzeria.persistencia.repository.PizzaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    private final PizzaRespository pizzaRespository;

    @Autowired
    public PizzaService(PizzaRespository pizzaRespository) {
        this.pizzaRespository=pizzaRespository;
    }

    public List<PizzaEntity> getAll(){
        return  this.pizzaRespository.findAll();
    }
    public PizzaEntity get(int idPizza){
        return  this.pizzaRespository.findById(idPizza).orElse(null);
    }

}

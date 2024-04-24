package com.ablSystem.crudSpringBoot.view;

import com.ablSystem.crudSpringBoot.model.mPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vPersona extends CrudRepository<mPersona, Integer>{
    
}

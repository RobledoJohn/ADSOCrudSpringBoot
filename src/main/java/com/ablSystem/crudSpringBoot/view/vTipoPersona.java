package com.ablSystem.crudSpringBoot.view;

import com.ablSystem.crudSpringBoot.model.mTipoPersona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vTipoPersona extends CrudRepository<mTipoPersona, Integer>{
    }
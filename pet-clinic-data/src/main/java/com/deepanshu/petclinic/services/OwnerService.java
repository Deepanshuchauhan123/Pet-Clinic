package com.deepanshu.petclinic.services;

import com.deepanshu.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}

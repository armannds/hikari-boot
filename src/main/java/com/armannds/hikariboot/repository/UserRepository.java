package com.armannds.hikariboot.repository;

import com.armannds.hikariboot.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}

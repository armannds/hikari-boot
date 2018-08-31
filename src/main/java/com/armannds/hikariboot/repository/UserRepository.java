package com.armannds.hikariboot.repository;

import com.armannds.hikariboot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

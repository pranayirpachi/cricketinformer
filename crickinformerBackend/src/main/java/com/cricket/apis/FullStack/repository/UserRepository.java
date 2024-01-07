package com.cricket.apis.FullStack.repository;

import com.cricket.apis.FullStack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}

package com.git.project.springdocker.DAO;

import com.git.project.springdocker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

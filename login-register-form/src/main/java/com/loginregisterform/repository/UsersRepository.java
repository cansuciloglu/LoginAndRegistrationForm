package com.loginregisterform.repository;

import com.loginregisterform.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {

    Optional<UsersModel> findByUsernameAndPassword(String username, String password);

    Optional<UsersModel> findFirstByUsername(String username);

}

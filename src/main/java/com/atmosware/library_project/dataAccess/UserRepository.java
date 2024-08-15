package com.atmosware.library_project.dataAccess;

import com.atmosware.library_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);

    Optional<User> findByUsername(String username);

}

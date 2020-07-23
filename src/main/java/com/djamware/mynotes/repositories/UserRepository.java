package com.djamware.mynotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.mynotes.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findUserByEmail(@Param("email") String email);

}

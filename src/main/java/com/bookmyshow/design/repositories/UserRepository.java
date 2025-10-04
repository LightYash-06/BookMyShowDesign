package com.bookmyshow.design.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookmyshow.design.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    public Optional<User> findById(Long userId);

    public Optional<User> findByEmail(String email);
}

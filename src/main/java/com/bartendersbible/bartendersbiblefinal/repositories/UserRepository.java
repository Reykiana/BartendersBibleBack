package com.bartendersbible.bartendersbiblefinal.repositories;

import com.bartendersbible.bartendersbiblefinal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

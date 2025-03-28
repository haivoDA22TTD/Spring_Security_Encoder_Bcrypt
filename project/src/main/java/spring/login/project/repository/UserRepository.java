package spring.login.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.login.project.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

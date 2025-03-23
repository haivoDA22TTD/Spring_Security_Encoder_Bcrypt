package demo.project.resful_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.project.resful_api.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

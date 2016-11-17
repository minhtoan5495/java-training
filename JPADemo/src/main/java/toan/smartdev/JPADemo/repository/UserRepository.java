package toan.smartdev.JPADemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import toan.smartdev.JPADemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

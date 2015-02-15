package mx.mikew.jba.repository;

import mx.mikew.jba.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

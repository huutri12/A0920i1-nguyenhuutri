package com.codegym.demo.repository;

import com.codegym.demo.model.User_role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<User_role, String > {
}

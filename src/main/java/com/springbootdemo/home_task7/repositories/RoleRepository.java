package com.springbootdemo.home_task7.repositories;

import com.springbootdemo.home_task7.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Roles, Long> {
}

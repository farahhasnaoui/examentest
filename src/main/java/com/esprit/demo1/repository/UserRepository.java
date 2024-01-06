package com.esprit.demo1.repository;

import com.esprit.demo1.entities.Project;
import com.esprit.demo1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {
}

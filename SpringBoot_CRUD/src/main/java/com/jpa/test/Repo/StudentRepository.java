package com.jpa.test.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entitites.User;

public interface StudentRepository extends JpaRepository<User, Long>{

	public List<User> findByName(String name);
}

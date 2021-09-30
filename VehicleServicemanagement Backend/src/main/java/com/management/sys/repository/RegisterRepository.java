package com.management.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.sys.model.User;
@Service
@Transactional
public interface RegisterRepository extends JpaRepository<User, Long> {
public User findByEmailAndPassword(String Email,String Password);
}

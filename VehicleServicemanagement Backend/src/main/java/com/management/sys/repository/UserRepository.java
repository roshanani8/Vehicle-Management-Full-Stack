package com.management.sys.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.sys.Enums.RoleType;
import com.management.sys.model.User;
import com.management.sys.model.Vehicle;

@Repository
public interface UserRepository extends JpaRepository<User ,Long>{
    List<User> getAllByRoleType(RoleType roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);

    User findUserByAfm(String afm);

    User findUserByEmail(String email);

    User getUserById(Long id);

    Optional<User> getUserByAfmAndEmail(String afm, String email);

    User findUserByVehicles(Vehicle Vehicle);
 
   //updated on 27/09 by sonali
    //User addUser(User user);

	
	
}

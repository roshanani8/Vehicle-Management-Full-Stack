
package com.management.sys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.management.sys.Enums.RoleType;
import com.management.sys.model.User;
import com.management.sys.model.Vehicle;
@Service
public interface UserService {
	
	List<User> getAllByRoleType(RoleType roleType);

    User getUserByFirstNameAndLastName(String firstName, String lastName);

    //User saveUser(User user);

    void deleteUser(User user);

    User findUserByAfm(String afm);

    User findUserByEmail(String email);

    User getUserById(Long id);

    List<User> getAllUsers();
   // User addUser(User User);

    Optional<User> getUserByAfmAndEmail(String afm, String email);

    User findUserByVehicles(Vehicle Vehicle);
		
		
}

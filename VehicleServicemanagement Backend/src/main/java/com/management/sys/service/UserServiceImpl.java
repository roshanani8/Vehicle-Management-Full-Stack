package com.management.sys.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.management.sys.Enums.RoleType;
import com.management.sys.model.User;
import com.management.sys.model.Vehicle;
import com.management.sys.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	 @Autowired
	    private UserRepository userRepository;

//	    @Transactional
//	    public User saveUser(User user){
//	        return userRepository.save(user);
//	    }

	    @Override
	    public void deleteUser(User user) {
	        userRepository.delete(user);
	    }

	    public List<User> getAllByRoleType(RoleType roleType) {
	        return userRepository.getAllByRoleType(roleType);
	    }

	    @Override
	    public User getUserByFirstNameAndLastName(String firstName, String lastName) {
	        return userRepository.getUserByFirstNameAndLastName(firstName, lastName);
	    }


	    @Override
	    public User findUserByAfm(String afm) {
	        return userRepository.findUserByAfm(afm);
	    }

	    @Override
	    public User findUserByEmail(String email) {
	        return userRepository.findUserByEmail(email);
	    }

	    @Override
	    public User getUserById(Long id) {
	        return userRepository.getUserById(id);
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public Optional<User> getUserByAfmAndEmail(String afm, String email) {
	        return userRepository.getUserByAfmAndEmail(afm, email);
	    }

	    @Override
	    public User findUserByVehicles(Vehicle vehicle) {
	        return userRepository.findUserByVehicles(vehicle);
	    }

//		@Override
//		public User addUser(User User) {
//			userRepository.save(User);
//			return User;
//		}



	
	
	



}

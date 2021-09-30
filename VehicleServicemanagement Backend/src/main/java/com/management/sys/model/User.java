package com.management.sys.model;


	import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.management.sys.Enums.RoleType;
	//TODO: status, cost(per item - total), owner, repair description,  repairType, Date
@Component	
@Entity
	@Table(name = "USER", uniqueConstraints = {@UniqueConstraint(columnNames = {"afm", "email"})})
	public class User {

	    private static final int MAX_LENGTH = 40;
	    private static final int HASH_PASSWORD_LENGTH = 120;

	    @Id
	    @Column(name = "user_id", nullable = false)
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "afm", length = MAX_LENGTH,unique=true)
	    private String afm;

	    @Column(name = "first_name", length = MAX_LENGTH)
	    private String firstName;

	    @Column(name = "last_name", length = MAX_LENGTH)
	    private String lastName;

	    @Column(name = "address", length = MAX_LENGTH)
	    private String address;
        
	    
	    @Column(name = "email", length = MAX_LENGTH,unique=true)
	    private String email;

	    @Column(name = "password", length = HASH_PASSWORD_LENGTH)
	    private String password;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "role_type")
	    private RoleType roleType;

	    @JsonIgnore
	    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, targetEntity = Vehicle.class)
	    private List<Vehicle> vehicles;

		public User(Long id, String afm, String firstName, String lastName, String address, String email,
				String password, RoleType roleType, List<Vehicle> vehicles) {
			super();
			this.id = id;
			this.afm = afm;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.email = email;
			this.password = password;
			this.roleType = roleType;
			this.vehicles = vehicles;
		}
		

		public User() {
			super();
		}


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAfm() {
			return afm;
		}

		public void setAfm(String afm) {
			this.afm = afm;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public RoleType getRoleType() {
			return roleType;
		}

		public void setRoleType(RoleType roleType) {
			this.roleType = roleType;
		}

		public List<Vehicle> getVehicles() {
			return vehicles;
		}

		public void setVehicles(List<Vehicle> vehicles) {
			this.vehicles = vehicles;
		}

		public static int getMaxLength() {
			return MAX_LENGTH;
		}

		public static int getHashPasswordLength() {
			return HASH_PASSWORD_LENGTH;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", afm=" + afm + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", address=" + address + ", email=" + email + ", password=" + password + ", roleType=" + roleType
					+ ", vehicles=" + vehicles + "]";
		}
	    
	    
	    
}

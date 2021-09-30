package com.management.sys.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
@Table(name = "VEHICLE", uniqueConstraints = @UniqueConstraint(columnNames = {"plate_number"}))
public class  Vehicle {

    private static final int MAX_LENGTH = 40;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicleId;

    @Column(name = "plate_number", length = MAX_LENGTH)
    private String plateNUmber;

    @Column(name = "model", length = MAX_LENGTH)
    private String model;

    @Column(name = "year_of_manufacture", length = 4)
    private String yearOfManufacture;

    @Column(name = "color", length = MAX_LENGTH)
    private String color;

    @JsonIgnore
    @OneToMany(mappedBy = "vehicle", targetEntity = JobSheet.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobSheet> jobsheet;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Vehicle(Long vehicleId, String plateNUmber, String model, String yearOfManufacture, String color,
			List<JobSheet> jobsheet, User user) {
		super();
		this.vehicleId = vehicleId;
		this.plateNUmber = plateNUmber;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.jobsheet = jobsheet;
		this.user = user;
	}

	public Vehicle() {
		
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getPlateNUmber() {
		return plateNUmber;
	}

	public void setPlateNUmber(String plateNUmber) {
		this.plateNUmber = plateNUmber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<JobSheet> getJobsheet() {
		return jobsheet;
	}

	public void setJobsheet(List<JobSheet> jobsheet) {
		this.jobsheet = jobsheet;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static int getMaxLength() {
		return MAX_LENGTH;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", plateNUmber=" + plateNUmber + ", model=" + model
				+ ", yearOfManufacture=" + yearOfManufacture + ", color=" + color + ", jobsheet=" + jobsheet + ", user="
				+ user + "]";
	}

	
	
	
}

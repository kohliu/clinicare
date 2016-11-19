package com.techstomach.justdental.model.schema;
// Generated Nov 19, 2016 4:08:03 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AddressDb generated by hbm2java
 */
@Entity
@Table(name = "address_db", catalog = "jd_database")
public class AddressDb implements java.io.Serializable {

	private Integer addressId;
	private String street1;
	private String street2;
	private String city;
	private String region;
	private int country;
	private boolean isActive;
	private List<EmergencyContactDb> emergencyContactDbs;
	private List<PatientDb> patientDbs;

	public AddressDb() {
	}

	public AddressDb(String street1, String city, String region, int country, boolean isActive) {
		this.street1 = street1;
		this.city = city;
		this.region = region;
		this.country = country;
		this.isActive = isActive;
	}

	public AddressDb(String street1, String street2, String city, String region, int country, boolean isActive,
					 List<EmergencyContactDb> emergencyContactDbs, List<PatientDb> patientDbs) {
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.region = region;
		this.country = country;
		this.isActive = isActive;
		this.emergencyContactDbs = emergencyContactDbs;
		this.patientDbs = patientDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "AddressID", unique = true, nullable = false)
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "Street1", nullable = false, length = 50)
	public String getStreet1() {
		return this.street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@Column(name = "Street2", length = 50)
	public String getStreet2() {
		return this.street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	@Column(name = "City", nullable = false, length = 30)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "Region", nullable = false, length = 30)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "Country", nullable = false)
	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	@Column(name = "IsActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addressDb")
	public List<EmergencyContactDb> getEmergencyContactDbs() {
		return this.emergencyContactDbs;
	}

	public void setEmergencyContactDbs(List<EmergencyContactDb> emergencyContactDbs) {
		this.emergencyContactDbs = emergencyContactDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "addressDb")
	public List<PatientDb> getPatientDbs() {
		return this.patientDbs;
	}

	public void setPatientDbs(List<PatientDb> patientDbs) {
		this.patientDbs = patientDbs;
	}

}
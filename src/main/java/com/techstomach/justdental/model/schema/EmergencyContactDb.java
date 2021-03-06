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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EmergencyContactDb generated by hbm2java
 */
@Entity
@Table(name = "emergency_contact_db", catalog = "jd_database")
public class EmergencyContactDb implements java.io.Serializable {

	private Integer emergencyContactId;
	private AddressDb addressDb;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int relationship;
	private boolean isActive;
	private List<PatientDb> patientDbs;

	public EmergencyContactDb() {
	}

	public EmergencyContactDb(AddressDb addressDb, String firstName, String lastName, int relationship,
			boolean isActive) {
		this.addressDb = addressDb;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
		this.isActive = isActive;
	}

	public EmergencyContactDb(AddressDb addressDb, String firstName, String lastName, String phoneNumber,
			int relationship, boolean isActive, List<PatientDb> patientDbs) {
		this.addressDb = addressDb;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.relationship = relationship;
		this.isActive = isActive;
		this.patientDbs = patientDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EmergencyContactID", unique = true, nullable = false)
	public Integer getEmergencyContactId() {
		return this.emergencyContactId;
	}

	public void setEmergencyContactId(Integer emergencyContactId) {
		this.emergencyContactId = emergencyContactId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AddressID", nullable = false)
	public AddressDb getAddressDb() {
		return this.addressDb;
	}

	public void setAddressDb(AddressDb addressDb) {
		this.addressDb = addressDb;
	}

	@Column(name = "FirstName", nullable = false, length = 30)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", nullable = false, length = 30)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "PhoneNumber", length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "Relationship", nullable = false)
	public int getRelationship() {
		return this.relationship;
	}

	public void setRelationship(int relationship) {
		this.relationship = relationship;
	}

	@Column(name = "IsActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "emergencyContactDb")
	public List<PatientDb> getPatientDbs() {
		return this.patientDbs;
	}

	public void setPatientDbs(List<PatientDb> patientDbs) {
		this.patientDbs = patientDbs;
	}

}

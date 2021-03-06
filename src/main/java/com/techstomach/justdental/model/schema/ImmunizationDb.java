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
 * ImmunizationDb generated by hbm2java
 */
@Entity
@Table(name = "immunization_db", catalog = "jd_database")
public class ImmunizationDb implements java.io.Serializable {

	private Integer immunizationId;
	private String vaccineType;
	private boolean isActive;
	private List<PatientImmunizationDb> patientImmunizationDbs;

	public ImmunizationDb() {
	}

	public ImmunizationDb(String vaccineType, boolean isActive) {
		this.vaccineType = vaccineType;
		this.isActive = isActive;
	}

	public ImmunizationDb(String vaccineType, boolean isActive, List<PatientImmunizationDb> patientImmunizationDbs) {
		this.vaccineType = vaccineType;
		this.isActive = isActive;
		this.patientImmunizationDbs = patientImmunizationDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ImmunizationID", unique = true, nullable = false)
	public Integer getImmunizationId() {
		return this.immunizationId;
	}

	public void setImmunizationId(Integer immunizationId) {
		this.immunizationId = immunizationId;
	}

	@Column(name = "VaccineType", nullable = false, length = 65535)
	public String getVaccineType() {
		return this.vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	@Column(name = "IsActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "immunizationDb")
	public List<PatientImmunizationDb> getPatientImmunizationDbs() {
		return this.patientImmunizationDbs;
	}

	public void setPatientImmunizationDbs(List<PatientImmunizationDb> patientImmunizationDbs) {
		this.patientImmunizationDbs = patientImmunizationDbs;
	}

}

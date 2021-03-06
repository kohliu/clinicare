package com.techstomach.justdental.model.schema;
// Generated Nov 19, 2016 4:08:03 PM by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientCheckinDb generated by hbm2java
 */
@Entity
@Table(name = "patient_checkin_db", catalog = "jd_database")
public class PatientCheckinDb implements java.io.Serializable {

	private Integer patientCheckInId;
	private LocationDb locationDb;
	private PatientDb patientDb;
	private UserDb userDb;
	private Date checkinTime;
	private byte patientType;
	private int invoiceId;
	private Date checkOutTime;
	private boolean isActive;
	private List<FeedchartDb> feedchartDbs ;
	private List<OutputChartDb> outputChartDbs ;
	private List<NoteDb> noteDbs ;
	private List<IntakeChartDb> intakeChartDbs ;
	private List<SurgeryDb> surgeryDbs ;
	private List<VitalsDb> vitalsDbs ;

	public PatientCheckinDb() {
	}

	public PatientCheckinDb(LocationDb locationDb, PatientDb patientDb, Date checkinTime, byte patientType,
			int invoiceId, boolean isActive) {
		this.locationDb = locationDb;
		this.patientDb = patientDb;
		this.checkinTime = checkinTime;
		this.patientType = patientType;
		this.invoiceId = invoiceId;
		this.isActive = isActive;
	}

	public PatientCheckinDb(LocationDb locationDb, PatientDb patientDb,
							UserDb userDb, Date checkinTime,
			byte patientType, int invoiceId, Date checkOutTime,
							boolean isActive, List<FeedchartDb> feedchartDbs,
							List<OutputChartDb> outputChartDbs,
							List<NoteDb> noteDbs, List<IntakeChartDb> intakeChartDbs,
							List<SurgeryDb> surgeryDbs,
							List<VitalsDb> vitalsDbs) {
		this.locationDb = locationDb;
		this.patientDb = patientDb;
		this.userDb = userDb;
		this.checkinTime = checkinTime;
		this.patientType = patientType;
		this.invoiceId = invoiceId;
		this.checkOutTime = checkOutTime;
		this.isActive = isActive;
		this.feedchartDbs = feedchartDbs;
		this.outputChartDbs = outputChartDbs;
		this.noteDbs = noteDbs;
		this.intakeChartDbs = intakeChartDbs;
		this.surgeryDbs = surgeryDbs;
		this.vitalsDbs = vitalsDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PatientCheckInID", unique = true, nullable = false)
	public Integer getPatientCheckInId() {
		return this.patientCheckInId;
	}

	public void setPatientCheckInId(Integer patientCheckInId) {
		this.patientCheckInId = patientCheckInId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LocationID", nullable = false)
	public LocationDb getLocationDb() {
		return this.locationDb;
	}

	public void setLocationDb(LocationDb locationDb) {
		this.locationDb = locationDb;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PatientID", nullable = false)
	public PatientDb getPatientDb() {
		return this.patientDb;
	}

	public void setPatientDb(PatientDb patientDb) {
		this.patientDb = patientDb;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserID")
	public UserDb getUserDb() {
		return this.userDb;
	}

	public void setUserDb(UserDb userDb) {
		this.userDb = userDb;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CheckinTime", nullable = false, length = 19)
	public Date getCheckinTime() {
		return this.checkinTime;
	}

	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}

	@Column(name = "PatientType", nullable = false)
	public byte getPatientType() {
		return this.patientType;
	}

	public void setPatientType(byte patientType) {
		this.patientType = patientType;
	}

	@Column(name = "InvoiceID", nullable = false)
	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CheckOutTime", length = 19)
	public Date getCheckOutTime() {
		return this.checkOutTime;
	}

	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Column(name = "IsActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<FeedchartDb> getFeedchartDbs() {
		return this.feedchartDbs;
	}

	public void setFeedchartDbs(List<FeedchartDb> feedchartDbs) {
		this.feedchartDbs = feedchartDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<OutputChartDb> getOutputChartDbs() {
		return this.outputChartDbs;
	}

	public void setOutputChartDbs(List<OutputChartDb> outputChartDbs) {
		this.outputChartDbs = outputChartDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<NoteDb>  getNoteDbs() {
		return this.noteDbs;
	}

	public void setNoteDbs(List<NoteDb>  noteDbs) {
		this.noteDbs = noteDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<IntakeChartDb> getIntakeChartDbs() {
		return this.intakeChartDbs;
	}

	public void setIntakeChartDbs(List<IntakeChartDb> intakeChartDbs) {
		this.intakeChartDbs = intakeChartDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<SurgeryDb> getSurgeryDbs() {
		return this.surgeryDbs;
	}

	public void setSurgeryDbs(List<SurgeryDb> surgeryDbs) {
		this.surgeryDbs = surgeryDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patientCheckinDb")
	public List<VitalsDb> getVitalsDbs() {
		return this.vitalsDbs;
	}

	public void setVitalsDbs(List<VitalsDb> vitalsDbs) {
		this.vitalsDbs = vitalsDbs;
	}

}

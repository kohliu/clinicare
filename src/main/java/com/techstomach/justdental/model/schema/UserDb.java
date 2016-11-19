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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserDb generated by hbm2java
 */
@Entity
@Table(name = "user_db", catalog = "jd_database")
public class UserDb implements java.io.Serializable {

	private Integer userId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String username;
	private String emailAddress;
	private String phoneNumber;
	private String staffType;
	private String licenseNumber;
	private Integer addressId;
	private String applicationName;
	private String password;
	private String passwordQuestion;
	private String passwordAnswer;
	private Date dateCreated;
	private Date lastLogin;
	private Date lastActivity;
	private Date lastPasswordChange;
	private Boolean isOnline;
	private String ipAddress;
	private Boolean isLockedOut;
	private Integer failedPasswordAttemptCount;
	private Boolean isApproved;
	private Boolean isActive;
	private List<NoteDb> noteDbs ;
	private List<PatientCheckinDb> patientCheckinDbs ;
	private List<SurgeryStaffDb> surgeryStaffDbs ;
	private List<TemplateDb> templateDbs ;

	public UserDb() {
	}

	public UserDb(String firstName, String middleName, String lastName, String username, String emailAddress,
			String phoneNumber, String staffType, String licenseNumber, Integer addressId, String applicationName,
			String password, String passwordQuestion, String passwordAnswer, Date dateCreated, Date lastLogin,
			Date lastActivity, Date lastPasswordChange, Boolean isOnline, String ipAddress, Boolean isLockedOut,
			Integer failedPasswordAttemptCount, Boolean isApproved,
				  Boolean isActive, List<NoteDb> noteDbs,
				  List<PatientCheckinDb> patientCheckinDbs,
				  List<SurgeryStaffDb> surgeryStaffDbs,
				  List<TemplateDb> templateDbs) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.username = username;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.staffType = staffType;
		this.licenseNumber = licenseNumber;
		this.addressId = addressId;
		this.applicationName = applicationName;
		this.password = password;
		this.passwordQuestion = passwordQuestion;
		this.passwordAnswer = passwordAnswer;
		this.dateCreated = dateCreated;
		this.lastLogin = lastLogin;
		this.lastActivity = lastActivity;
		this.lastPasswordChange = lastPasswordChange;
		this.isOnline = isOnline;
		this.ipAddress = ipAddress;
		this.isLockedOut = isLockedOut;
		this.failedPasswordAttemptCount = failedPasswordAttemptCount;
		this.isApproved = isApproved;
		this.isActive = isActive;
		this.noteDbs = noteDbs;
		this.patientCheckinDbs = patientCheckinDbs;
		this.surgeryStaffDbs = surgeryStaffDbs;
		this.templateDbs = templateDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "UserID", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "FirstName", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "MiddleName", length = 50)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "LastName", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "Username", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "EmailAddress", length = 50)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Column(name = "PhoneNumber", length = 20)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "StaffType", length = 25)
	public String getStaffType() {
		return this.staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	@Column(name = "LicenseNumber", length = 20)
	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@Column(name = "AddressID")
	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	@Column(name = "ApplicationName", length = 30)
	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@Column(name = "Password", length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PasswordQuestion", length = 50)
	public String getPasswordQuestion() {
		return this.passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	@Column(name = "PasswordAnswer", length = 50)
	public String getPasswordAnswer() {
		return this.passwordAnswer;
	}

	public void setPasswordAnswer(String passwordAnswer) {
		this.passwordAnswer = passwordAnswer;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateCreated", length = 19)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastLogin", length = 19)
	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastActivity", length = 19)
	public Date getLastActivity() {
		return this.lastActivity;
	}

	public void setLastActivity(Date lastActivity) {
		this.lastActivity = lastActivity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastPasswordChange", length = 19)
	public Date getLastPasswordChange() {
		return this.lastPasswordChange;
	}

	public void setLastPasswordChange(Date lastPasswordChange) {
		this.lastPasswordChange = lastPasswordChange;
	}

	@Column(name = "IsOnline")
	public Boolean getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}

	@Column(name = "IpAddress", length = 20)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "IsLockedOut")
	public Boolean getIsLockedOut() {
		return this.isLockedOut;
	}

	public void setIsLockedOut(Boolean isLockedOut) {
		this.isLockedOut = isLockedOut;
	}

	@Column(name = "FailedPasswordAttemptCount")
	public Integer getFailedPasswordAttemptCount() {
		return this.failedPasswordAttemptCount;
	}

	public void setFailedPasswordAttemptCount(Integer failedPasswordAttemptCount) {
		this.failedPasswordAttemptCount = failedPasswordAttemptCount;
	}

	@Column(name = "IsApproved")
	public Boolean getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		this.isApproved = isApproved;
	}

	@Column(name = "IsActive")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDb")
	public List<NoteDb> getNoteDbs() {
		return this.noteDbs;
	}

	public void setNoteDbs(List<NoteDb> noteDbs) {
		this.noteDbs = noteDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDb")
	public List<PatientCheckinDb> getPatientCheckinDbs() {
		return this.patientCheckinDbs;
	}

	public void setPatientCheckinDbs(List<PatientCheckinDb> patientCheckinDbs) {
		this.patientCheckinDbs = patientCheckinDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDb")
	public List<SurgeryStaffDb> getSurgeryStaffDbs() {
		return this.surgeryStaffDbs;
	}

	public void setSurgeryStaffDbs(List<SurgeryStaffDb> surgeryStaffDbs) {
		this.surgeryStaffDbs = surgeryStaffDbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userDb")
	public List<TemplateDb> getTemplateDbs() {
		return this.templateDbs;
	}

	public void setTemplateDbs(List<TemplateDb> templateDbs) {
		this.templateDbs = templateDbs;
	}

}
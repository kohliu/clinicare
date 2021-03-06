package com.techstomach.justdental.model.schema;
// Generated Nov 19, 2016 4:08:03 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
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
 * ServiceDb generated by hbm2java
 */
@Entity
@Table(name = "service_db", catalog = "jd_database")
public class ServiceDb implements java.io.Serializable {

	private Integer serviceId;
	private String name;
	private BigDecimal serviceCost;
	private boolean isActive;
	private List<InvoiceitemDb> invoiceitemDbs;

	public ServiceDb() {
	}

	public ServiceDb(String name, BigDecimal serviceCost, boolean isActive) {
		this.name = name;
		this.serviceCost = serviceCost;
		this.isActive = isActive;
	}

	public ServiceDb(String name, BigDecimal serviceCost, boolean isActive, List<InvoiceitemDb>  invoiceitemDbs) {
		this.name = name;
		this.serviceCost = serviceCost;
		this.isActive = isActive;
		this.invoiceitemDbs = invoiceitemDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ServiceID", unique = true, nullable = false)
	public Integer getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	@Column(name = "Name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ServiceCost", nullable = false, precision = 6)
	public BigDecimal getServiceCost() {
		return this.serviceCost;
	}

	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}

	@Column(name = "IsActive", nullable = false)
	public boolean isIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceDb")
	public List<InvoiceitemDb>  getInvoiceitemDbs() {
		return this.invoiceitemDbs;
	}

	public void setInvoiceitemDbs(List<InvoiceitemDb>  invoiceitemDbs) {
		this.invoiceitemDbs = invoiceitemDbs;
	}

}

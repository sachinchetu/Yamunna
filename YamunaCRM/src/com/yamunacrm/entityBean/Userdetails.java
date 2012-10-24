/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "userdetails", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Userdetails.findAll", query = "SELECT u FROM Userdetails u"),
    @NamedQuery(name = "Userdetails.findByUserDetailsId", query = "SELECT u FROM Userdetails u WHERE u.userDetailsId = :userDetailsId"),
    @NamedQuery(name = "Userdetails.findByEmployeeCode", query = "SELECT u FROM Userdetails u WHERE u.employeeCode = :employeeCode"),
    @NamedQuery(name = "Userdetails.findByFirstName", query = "SELECT u FROM Userdetails u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Userdetails.findByFatherName", query = "SELECT u FROM Userdetails u WHERE u.fatherName = :fatherName"),
    @NamedQuery(name = "Userdetails.findByAddress", query = "SELECT u FROM Userdetails u WHERE u.address = :address"),
    @NamedQuery(name = "Userdetails.findByPanNo", query = "SELECT u FROM Userdetails u WHERE u.panNo = :panNo"),
    @NamedQuery(name = "Userdetails.findByMobileNo", query = "SELECT u FROM Userdetails u WHERE u.mobileNo = :mobileNo"),
    @NamedQuery(name = "Userdetails.findByLandlineNo", query = "SELECT u FROM Userdetails u WHERE u.landlineNo = :landlineNo"),
    @NamedQuery(name = "Userdetails.findByOfficialMobileNo", query = "SELECT u FROM Userdetails u WHERE u.officialMobileNo = :officialMobileNo"),
    @NamedQuery(name = "Userdetails.findByPersonalMailId", query = "SELECT u FROM Userdetails u WHERE u.personalMailId = :personalMailId"),
    @NamedQuery(name = "Userdetails.findByOfficialMailId", query = "SELECT u FROM Userdetails u WHERE u.officialMailId = :officialMailId"),
    @NamedQuery(name = "Userdetails.findByCreatedOn", query = "SELECT u FROM Userdetails u WHERE u.createdOn = :createdOn"),
    @NamedQuery(name = "Userdetails.findByModifiedOn", query = "SELECT u FROM Userdetails u WHERE u.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Userdetails.findByEndDate", query = "SELECT u FROM Userdetails u WHERE u.endDate = :endDate"),
    @NamedQuery(name = "Userdetails.findByLastName", query = "SELECT u FROM Userdetails u WHERE u.lastName = :lastName")})
public class Userdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userDetailsId", nullable = false)
    private Integer userDetailsId;
    @Basic(optional = false)
    @Column(name = "employeeCode", nullable = false, length = 45)
    private String employeeCode;
    @Basic(optional = false)
    @Column(name = "firstName", nullable = false, length = 45)
    private String firstName;
    @Column(name = "fatherName", length = 45)
    private String fatherName;
    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "panNo", length = 45)
    private String panNo;
    @Column(name = "mobileNo")
    private Integer mobileNo;
    @Column(name = "landlineNo")
    private Integer landlineNo;
    @Column(name = "officialMobileNo")
    private Integer officialMobileNo;
    @Column(name = "personalMailId", length = 45)
    private String personalMailId;
    @Basic(optional = false)
    @Column(name = "officialMailId", nullable = false, length = 45)
    private String officialMailId;
    @Basic(optional = false)
    @Column(name = "createdOn", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "lastName", length = 45)
    private String lastName;
    @JoinColumn(name = "reportTo", referencedColumnName = "userId", nullable = false)
    @ManyToOne(optional = false)
    private Users reportTo;
    @JoinColumn(name = "supervisor", referencedColumnName = "userId", nullable = false)
    @ManyToOne(optional = false)
    private Users supervisor;
    @JoinColumn(name = "userId", referencedColumnName = "userId", nullable = false)
    @ManyToOne(optional = false)
    private Users userId;

    public Userdetails() {
    }

    public Userdetails(Integer userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public Userdetails(Integer userDetailsId, String employeeCode, String firstName, String officialMailId, Date createdOn) {
        this.userDetailsId = userDetailsId;
        this.employeeCode = employeeCode;
        this.firstName = firstName;
        this.officialMailId = officialMailId;
        this.createdOn = createdOn;
    }

    public Integer getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Integer userDetailsId) {
        this.userDetailsId = userDetailsId;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getLandlineNo() {
        return landlineNo;
    }

    public void setLandlineNo(Integer landlineNo) {
        this.landlineNo = landlineNo;
    }

    public Integer getOfficialMobileNo() {
        return officialMobileNo;
    }

    public void setOfficialMobileNo(Integer officialMobileNo) {
        this.officialMobileNo = officialMobileNo;
    }

    public String getPersonalMailId() {
        return personalMailId;
    }

    public void setPersonalMailId(String personalMailId) {
        this.personalMailId = personalMailId;
    }

    public String getOfficialMailId() {
        return officialMailId;
    }

    public void setOfficialMailId(String officialMailId) {
        this.officialMailId = officialMailId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public Users getReportTo() {
        return reportTo;
    }

    public void setReportTo(Users reportTo) {
        this.reportTo = reportTo;
    }

    public Users getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Users supervisor) {
        this.supervisor = supervisor;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDetailsId != null ? userDetailsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userdetails)) {
            return false;
        }
        Userdetails other = (Userdetails) object;
        if ((this.userDetailsId == null && other.userDetailsId != null) || (this.userDetailsId != null && !this.userDetailsId.equals(other.userDetailsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Userdetails[userDetailsId=" + userDetailsId + "]";
    }

}

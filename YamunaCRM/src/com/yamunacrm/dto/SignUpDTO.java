package com.yamunacrm.dto;

import java.io.Serializable;
import java.util.Date;

public class SignUpDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String employeeCode;
    private String firstName;
    private String fatherName;
    private String address;
    private String email;
    private String officialEmail;
    private String panNo;
    private long mobileNo;
    private String landlineNo;
    private long officialMobileNo;
    private String personalMailId;
    private String officialMailId;
    private Date createdOn;
    private Date modifiedOn;
    private Date endDate;
    private String lastName;
    private Integer roleId;
    private Integer reportTo;
    private Integer supervisor;
    private String userName;
    private String createdBy;
    private Character isActive;
    private Integer accountCounter;
    private String password;

    public SignUpDTO() {
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

    public String getLandlineNo() {
        return landlineNo;
    }

    public void setLandlineNo(String landlineNo) {
        this.landlineNo = landlineNo;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public long getOfficialMobileNo() {
        return officialMobileNo;
    }

    public void setOfficialMobileNo(long officialMobileNo) {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAccountCounter() {
        return accountCounter;
    }

    public void setAccountCounter(Integer accountCounter) {
        this.accountCounter = accountCounter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getReportTo() {
        return reportTo;
    }

    public void setReportTo(Integer reportTo) {
        this.reportTo = reportTo;
    }

    public String getOfficialEmail() {
        return officialEmail;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public Integer getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Integer supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "SignUpDTO{" + "employeeCode=" + employeeCode + "firstName=" + firstName + "fatherName=" + fatherName + "address=" + address + "email=" + email + "officialEmail=" + officialEmail + "panNo=" + panNo + "mobileNo=" + mobileNo + "landlineNo=" + landlineNo + "officialMobileNo=" + officialMobileNo + "personalMailId=" + personalMailId + "officialMailId=" + officialMailId + "createdOn=" + createdOn + "modifiedOn=" + modifiedOn + "endDate=" + endDate + "lastName=" + lastName + "roleId=" + roleId + "reportTo=" + reportTo + "supervisor=" + supervisor + "userName=" + userName + "createdBy=" + createdBy + "isActive=" + isActive + "accountCounter=" + accountCounter + "password=" + password + '}';
    }
}

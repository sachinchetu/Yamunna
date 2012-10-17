/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "users", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByUserName", query = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByCreatedOn", query = "SELECT u FROM Users u WHERE u.createdOn = :createdOn"),
    @NamedQuery(name = "Users.findByModifiedOn", query = "SELECT u FROM Users u WHERE u.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Users.findByCreatedBy", query = "SELECT u FROM Users u WHERE u.createdBy = :createdBy"),
    @NamedQuery(name = "Users.findByIsActive", query = "SELECT u FROM Users u WHERE u.isActive = :isActive"),
    @NamedQuery(name = "Users.findByAccountCounter", query = "SELECT u FROM Users u WHERE u.accountCounter = :accountCounter"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByMaxAttempt", query = "SELECT u FROM Users u WHERE u.maxAttempt = :maxAttempt"),
    @NamedQuery(name = "Users.findByUserID", query = "SELECT u FROM Users u WHERE u.userName = :userName and u.password = :password and u.isActive = 'A'")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userId", nullable = false)
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "userName", nullable = false, length = 45)
    private String userName;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "createdBy", length = 45)
    private String createdBy;
    @Column(name = "isActive")
    private Character isActive;
    @Column(name = "accountCounter")
    private Integer accountCounter;
    @Basic(optional = false)
    @Column(name = "password", nullable = false, length = 45)
    private String password;
    @Column(name = "maxAttempt", length = 10)
    private String maxAttempt;
    @JoinColumn(name = "roleId", referencedColumnName = "roleId", nullable = false)
    @ManyToOne(optional = false)
    private Roles roleId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<Companyaccount> companyaccountSet;
    @OneToMany(mappedBy = "userId")
    private Set<Expenses> expensesSet;
    @OneToMany(mappedBy = "tourOrderedBy")
    private Set<Expenses> expensesSet1;
    @OneToMany(mappedBy = "tourSanctionedBy")
    private Set<Expenses> expensesSet2;
    @OneToMany(mappedBy = "userId")
    private Set<Usertargetmapping> usertargetmappingSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reportTo")
    private Set<Userdetails> userdetailsSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supervisor")
    private Set<Userdetails> userdetailsSet1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Set<Userdetails> userdetailsSet2;
    @OneToMany(mappedBy = "userId")
    private Set<Task> taskSet;
    @OneToMany(mappedBy = "userId")
    private Set<Appointment> appointmentSet;
    @OneToMany(mappedBy = "assignedTo")
    private Set<Oppurtunity> oppurtunitySet;
    @OneToMany(mappedBy = "assignedBy")
    private Set<Oppurtunity> oppurtunitySet1;
    @OneToMany(mappedBy = "userId")
    private Set<Target> targetSet;

    public Users() {
    }

    public Users(Integer userId) {
        this.userId = userId;
    }

    public Users(Integer userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getMaxAttempt() {
        return maxAttempt;
    }

    public void setMaxAttempt(String maxAttempt) {
        this.maxAttempt = maxAttempt;
    }

    public Roles getRoleId() {
        return roleId;
    }

    public void setRoleId(Roles roleId) {
        this.roleId = roleId;
    }

    public Set<Companyaccount> getCompanyaccountSet() {
        return companyaccountSet;
    }

    public void setCompanyaccountSet(Set<Companyaccount> companyaccountSet) {
        this.companyaccountSet = companyaccountSet;
    }

    public Set<Expenses> getExpensesSet() {
        return expensesSet;
    }

    public void setExpensesSet(Set<Expenses> expensesSet) {
        this.expensesSet = expensesSet;
    }

    public Set<Expenses> getExpensesSet1() {
        return expensesSet1;
    }

    public void setExpensesSet1(Set<Expenses> expensesSet1) {
        this.expensesSet1 = expensesSet1;
    }

    public Set<Expenses> getExpensesSet2() {
        return expensesSet2;
    }

    public void setExpensesSet2(Set<Expenses> expensesSet2) {
        this.expensesSet2 = expensesSet2;
    }

    public Set<Usertargetmapping> getUsertargetmappingSet() {
        return usertargetmappingSet;
    }

    public void setUsertargetmappingSet(Set<Usertargetmapping> usertargetmappingSet) {
        this.usertargetmappingSet = usertargetmappingSet;
    }

    public Set<Userdetails> getUserdetailsSet() {
        return userdetailsSet;
    }

    public void setUserdetailsSet(Set<Userdetails> userdetailsSet) {
        this.userdetailsSet = userdetailsSet;
    }

    public Set<Userdetails> getUserdetailsSet1() {
        return userdetailsSet1;
    }

    public void setUserdetailsSet1(Set<Userdetails> userdetailsSet1) {
        this.userdetailsSet1 = userdetailsSet1;
    }

    public Set<Userdetails> getUserdetailsSet2() {
        return userdetailsSet2;
    }

    public void setUserdetailsSet2(Set<Userdetails> userdetailsSet2) {
        this.userdetailsSet2 = userdetailsSet2;
    }

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }

    public Set<Appointment> getAppointmentSet() {
        return appointmentSet;
    }

    public void setAppointmentSet(Set<Appointment> appointmentSet) {
        this.appointmentSet = appointmentSet;
    }

    public Set<Oppurtunity> getOppurtunitySet() {
        return oppurtunitySet;
    }

    public void setOppurtunitySet(Set<Oppurtunity> oppurtunitySet) {
        this.oppurtunitySet = oppurtunitySet;
    }

    public Set<Oppurtunity> getOppurtunitySet1() {
        return oppurtunitySet1;
    }

    public void setOppurtunitySet1(Set<Oppurtunity> oppurtunitySet1) {
        this.oppurtunitySet1 = oppurtunitySet1;
    }

    public Set<Target> getTargetSet() {
        return targetSet;
    }

    public void setTargetSet(Set<Target> targetSet) {
        this.targetSet = targetSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Users[userId=" + userId + "]";
    }

}

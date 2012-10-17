/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "companyaccount", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Companyaccount.findAll", query = "SELECT c FROM Companyaccount c"),
    @NamedQuery(name = "Companyaccount.findByAccountId", query = "SELECT c FROM Companyaccount c WHERE c.accountId = :accountId"),
    @NamedQuery(name = "Companyaccount.findByAccountName", query = "SELECT c FROM Companyaccount c WHERE c.accountName = :accountName"),
    @NamedQuery(name = "Companyaccount.findByAccountOwner", query = "SELECT c FROM Companyaccount c WHERE c.accountOwner = :accountOwner"),
    @NamedQuery(name = "Companyaccount.findByPhoneNo", query = "SELECT c FROM Companyaccount c WHERE c.phoneNo = :phoneNo"),
    @NamedQuery(name = "Companyaccount.findByFax", query = "SELECT c FROM Companyaccount c WHERE c.fax = :fax"),
    @NamedQuery(name = "Companyaccount.findByWebsite", query = "SELECT c FROM Companyaccount c WHERE c.website = :website"),
    @NamedQuery(name = "Companyaccount.findByParentAccountId", query = "SELECT c FROM Companyaccount c WHERE c.parentAccountId = :parentAccountId"),
    @NamedQuery(name = "Companyaccount.findByDescription", query = "SELECT c FROM Companyaccount c WHERE c.description = :description"),
    @NamedQuery(name = "Companyaccount.findByCreatedOn", query = "SELECT c FROM Companyaccount c WHERE c.createdOn = :createdOn"),
    @NamedQuery(name = "Companyaccount.findByModifiedOn", query = "SELECT c FROM Companyaccount c WHERE c.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Companyaccount.findByNoOfEmployees", query = "SELECT c FROM Companyaccount c WHERE c.noOfEmployees = :noOfEmployees"),
    @NamedQuery(name = "Companyaccount.findByAnnualRevenue", query = "SELECT c FROM Companyaccount c WHERE c.annualRevenue = :annualRevenue"),
    @NamedQuery(name = "Companyaccount.findByPotentialRevenue", query = "SELECT c FROM Companyaccount c WHERE c.potentialRevenue = :potentialRevenue"),
    @NamedQuery(name = "Companyaccount.findByRegionId", query = "SELECT c FROM Companyaccount c WHERE c.regionId = :regionId")})
public class Companyaccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "accountId", nullable = false)
    private Integer accountId;
    @Basic(optional = false)
    @Column(name = "accountName", nullable = false, length = 45)
    private String accountName;
    @Column(name = "accountOwner", length = 45)
    private String accountOwner;
    @Column(name = "phoneNo")
    private Integer phoneNo;
    @Column(name = "fax")
    private Integer fax;
    @Column(name = "website", length = 45)
    private String website;
    @Column(name = "parentAccountId")
    private Integer parentAccountId;
    @Column(name = "description", length = 45)
    private String description;
    @Basic(optional = false)
    @Column(name = "createdOn", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "noOfEmployees")
    private Integer noOfEmployees;
    @Column(name = "annualRevenue", length = 45)
    private String annualRevenue;
    @Column(name = "potentialRevenue", length = 45)
    private String potentialRevenue;
    @Column(name = "regionId")
    private Integer regionId;
    @JoinColumn(name = "userId", referencedColumnName = "userId", nullable = false)
    @ManyToOne(optional = false)
    private Users userId;
    @JoinColumn(name = "territoryId", referencedColumnName = "territoryId")
    @ManyToOne
    private Territory territoryId;
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    @ManyToOne
    private Location locationId;
    @OneToMany(mappedBy = "accountId")
    private Set<Contacts> contactsSet;
    @OneToMany(mappedBy = "accountId")
    private Set<Accountindustrymapping> accountindustrymappingSet;
    @OneToMany(mappedBy = "accountId")
    private Set<Oppurtunity> oppurtunitySet;

    public Companyaccount() {
    }

    public Companyaccount(Integer accountId) {
        this.accountId = accountId;
    }

    public Companyaccount(Integer accountId, String accountName, Date createdOn) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.createdOn = createdOn;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getFax() {
        return fax;
    }

    public void setFax(Integer fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getParentAccountId() {
        return parentAccountId;
    }

    public void setParentAccountId(Integer parentAccountId) {
        this.parentAccountId = parentAccountId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getPotentialRevenue() {
        return potentialRevenue;
    }

    public void setPotentialRevenue(String potentialRevenue) {
        this.potentialRevenue = potentialRevenue;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Territory getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Territory territoryId) {
        this.territoryId = territoryId;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public Set<Contacts> getContactsSet() {
        return contactsSet;
    }

    public void setContactsSet(Set<Contacts> contactsSet) {
        this.contactsSet = contactsSet;
    }

    public Set<Accountindustrymapping> getAccountindustrymappingSet() {
        return accountindustrymappingSet;
    }

    public void setAccountindustrymappingSet(Set<Accountindustrymapping> accountindustrymappingSet) {
        this.accountindustrymappingSet = accountindustrymappingSet;
    }

    public Set<Oppurtunity> getOppurtunitySet() {
        return oppurtunitySet;
    }

    public void setOppurtunitySet(Set<Oppurtunity> oppurtunitySet) {
        this.oppurtunitySet = oppurtunitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountId != null ? accountId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Companyaccount)) {
            return false;
        }
        Companyaccount other = (Companyaccount) object;
        if ((this.accountId == null && other.accountId != null) || (this.accountId != null && !this.accountId.equals(other.accountId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Companyaccount[accountId=" + accountId + "]";
    }

}

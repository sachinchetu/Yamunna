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
@Table(name = "industry", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Industry.findAll", query = "SELECT i FROM Industry i"),
    @NamedQuery(name = "Industry.findByIndustryId", query = "SELECT i FROM Industry i WHERE i.industryId = :industryId"),
    @NamedQuery(name = "Industry.findByIndustryCode", query = "SELECT i FROM Industry i WHERE i.industryCode = :industryCode"),
    @NamedQuery(name = "Industry.findByIndustryName", query = "SELECT i FROM Industry i WHERE i.industryName = :industryName"),
    @NamedQuery(name = "Industry.findByCreatedOn", query = "SELECT i FROM Industry i WHERE i.createdOn = :createdOn"),
    @NamedQuery(name = "Industry.findByModifiedOn", query = "SELECT i FROM Industry i WHERE i.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Industry.findByIsActive", query = "SELECT i FROM Industry i WHERE i.isActive = :isActive")})
public class Industry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "industryId", nullable = false)
    private Integer industryId;
    @Column(name = "industryCode", length = 45)
    private String industryCode;
    @Column(name = "industryName", length = 45)
    private String industryName;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "isActive")
    private Character isActive;
    @OneToMany(mappedBy = "industryId")
    private Set<Accountindustrymapping> accountindustrymappingSet;
    @OneToMany(mappedBy = "industryId")
    private Set<Oppurtunity> oppurtunitySet;

    public Industry() {
    }

    public Industry(Integer industryId) {
        this.industryId = industryId;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
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

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
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
        hash += (industryId != null ? industryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Industry)) {
            return false;
        }
        Industry other = (Industry) object;
        if ((this.industryId == null && other.industryId != null) || (this.industryId != null && !this.industryId.equals(other.industryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Industry[industryId=" + industryId + "]";
    }

}

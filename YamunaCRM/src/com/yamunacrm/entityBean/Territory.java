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
@Table(name = "territory", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Territory.findAll", query = "SELECT t FROM Territory t"),
    @NamedQuery(name = "Territory.findByTerritoryId", query = "SELECT t FROM Territory t WHERE t.territoryId = :territoryId"),
    @NamedQuery(name = "Territory.findByTerritoryName", query = "SELECT t FROM Territory t WHERE t.territoryName = :territoryName"),
    @NamedQuery(name = "Territory.findByCreatedOn", query = "SELECT t FROM Territory t WHERE t.createdOn = :createdOn"),
    @NamedQuery(name = "Territory.findByModifiedOn", query = "SELECT t FROM Territory t WHERE t.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Territory.findByIsActive", query = "SELECT t FROM Territory t WHERE t.isActive = :isActive")})
public class Territory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "territoryId", nullable = false)
    private Integer territoryId;
    @Column(name = "territoryName", length = 45)
    private String territoryName;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Basic(optional = false)
    @Column(name = "isActive", nullable = false)
    private char isActive;
    @OneToMany(mappedBy = "territoryId")
    private Set<Location> locationSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "territoryId")
    private Set<State> stateSet;
    @OneToMany(mappedBy = "territoryId")
    private Set<Companyaccount> companyaccountSet;

    public Territory() {
    }

    public Territory(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public Territory(Integer territoryId, char isActive) {
        this.territoryId = territoryId;
        this.isActive = isActive;
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
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

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    public Set<Location> getLocationSet() {
        return locationSet;
    }

    public void setLocationSet(Set<Location> locationSet) {
        this.locationSet = locationSet;
    }

    public Set<State> getStateSet() {
        return stateSet;
    }

    public void setStateSet(Set<State> stateSet) {
        this.stateSet = stateSet;
    }

    public Set<Companyaccount> getCompanyaccountSet() {
        return companyaccountSet;
    }

    public void setCompanyaccountSet(Set<Companyaccount> companyaccountSet) {
        this.companyaccountSet = companyaccountSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (territoryId != null ? territoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Territory)) {
            return false;
        }
        Territory other = (Territory) object;
        if ((this.territoryId == null && other.territoryId != null) || (this.territoryId != null && !this.territoryId.equals(other.territoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Territory[territoryId=" + territoryId + "]";
    }

}

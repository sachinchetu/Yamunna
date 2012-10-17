/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
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

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "location", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l"),
    @NamedQuery(name = "Location.findByLocationId", query = "SELECT l FROM Location l WHERE l.locationId = :locationId"),
    @NamedQuery(name = "Location.findByLocationName", query = "SELECT l FROM Location l WHERE l.locationName = :locationName"),
    @NamedQuery(name = "Location.findByIsActive", query = "SELECT l FROM Location l WHERE l.isActive = :isActive")})
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "locationId", nullable = false)
    private Integer locationId;
    @Column(name = "locationName", length = 45)
    private String locationName;
    @Column(name = "isActive")
    private Character isActive;
    @JoinColumn(name = "territoryId", referencedColumnName = "territoryId")
    @ManyToOne
    private Territory territoryId;
    @JoinColumn(name = "stateId", referencedColumnName = "stateId")
    @ManyToOne
    private State stateId;
    @OneToMany(mappedBy = "locationId")
    private Set<Companyaccount> companyaccountSet;

    public Location() {
    }

    public Location(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public Territory getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Territory territoryId) {
        this.territoryId = territoryId;
    }

    public State getStateId() {
        return stateId;
    }

    public void setStateId(State stateId) {
        this.stateId = stateId;
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
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Location[locationId=" + locationId + "]";
    }

}

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
@Table(name = "state", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "State.findAll", query = "SELECT s FROM State s"),
    @NamedQuery(name = "State.findByStateId", query = "SELECT s FROM State s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "State.findByStateName", query = "SELECT s FROM State s WHERE s.stateName = :stateName"),
    @NamedQuery(name = "State.findByIsActive", query = "SELECT s FROM State s WHERE s.isActive = :isActive")})
public class State implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stateId", nullable = false)
    private Integer stateId;
    @Basic(optional = false)
    @Column(name = "stateName", nullable = false, length = 45)
    private String stateName;
    @Basic(optional = false)
    @Column(name = "isActive", nullable = false)
    private char isActive;
    @OneToMany(mappedBy = "stateId")
    private Set<Location> locationSet;
    @JoinColumn(name = "territoryId", referencedColumnName = "territoryId", nullable = false)
    @ManyToOne(optional = false)
    private Territory territoryId;

    public State() {
    }

    public State(Integer stateId) {
        this.stateId = stateId;
    }

    public State(Integer stateId, String stateName, char isActive) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.isActive = isActive;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
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

    public Territory getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Territory territoryId) {
        this.territoryId = territoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateId != null ? stateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof State)) {
            return false;
        }
        State other = (State) object;
        if ((this.stateId == null && other.stateId != null) || (this.stateId != null && !this.stateId.equals(other.stateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.State[stateId=" + stateId + "]";
    }

}

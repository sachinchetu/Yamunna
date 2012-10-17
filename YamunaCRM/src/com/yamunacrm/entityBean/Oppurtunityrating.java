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
@Table(name = "oppurtunityrating", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Oppurtunityrating.findAll", query = "SELECT o FROM Oppurtunityrating o"),
    @NamedQuery(name = "Oppurtunityrating.findByOppurtunityRatingId", query = "SELECT o FROM Oppurtunityrating o WHERE o.oppurtunityRatingId = :oppurtunityRatingId"),
    @NamedQuery(name = "Oppurtunityrating.findByCreatedOn", query = "SELECT o FROM Oppurtunityrating o WHERE o.createdOn = :createdOn"),
    @NamedQuery(name = "Oppurtunityrating.findByModifiedOn", query = "SELECT o FROM Oppurtunityrating o WHERE o.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Oppurtunityrating.findByIsActive", query = "SELECT o FROM Oppurtunityrating o WHERE o.isActive = :isActive"),
    @NamedQuery(name = "Oppurtunityrating.findByOppurtunityRatingName", query = "SELECT o FROM Oppurtunityrating o WHERE o.oppurtunityRatingName = :oppurtunityRatingName")})
public class Oppurtunityrating implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oppurtunityRatingId", nullable = false)
    private Integer oppurtunityRatingId;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "isActive")
    private Character isActive;
    @Basic(optional = false)
    @Column(name = "oppurtunityRatingName", nullable = false, length = 45)
    private String oppurtunityRatingName;
    @OneToMany(mappedBy = "oppurtunityRatingId")
    private Set<Oppurtunity> oppurtunitySet;

    public Oppurtunityrating() {
    }

    public Oppurtunityrating(Integer oppurtunityRatingId) {
        this.oppurtunityRatingId = oppurtunityRatingId;
    }

    public Oppurtunityrating(Integer oppurtunityRatingId, String oppurtunityRatingName) {
        this.oppurtunityRatingId = oppurtunityRatingId;
        this.oppurtunityRatingName = oppurtunityRatingName;
    }

    public Integer getOppurtunityRatingId() {
        return oppurtunityRatingId;
    }

    public void setOppurtunityRatingId(Integer oppurtunityRatingId) {
        this.oppurtunityRatingId = oppurtunityRatingId;
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

    public String getOppurtunityRatingName() {
        return oppurtunityRatingName;
    }

    public void setOppurtunityRatingName(String oppurtunityRatingName) {
        this.oppurtunityRatingName = oppurtunityRatingName;
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
        hash += (oppurtunityRatingId != null ? oppurtunityRatingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oppurtunityrating)) {
            return false;
        }
        Oppurtunityrating other = (Oppurtunityrating) object;
        if ((this.oppurtunityRatingId == null && other.oppurtunityRatingId != null) || (this.oppurtunityRatingId != null && !this.oppurtunityRatingId.equals(other.oppurtunityRatingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Oppurtunityrating[oppurtunityRatingId=" + oppurtunityRatingId + "]";
    }

}

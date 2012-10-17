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
@Table(name = "opportunitytype", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Opportunitytype.findAll", query = "SELECT o FROM Opportunitytype o"),
    @NamedQuery(name = "Opportunitytype.findByOppTypeId", query = "SELECT o FROM Opportunitytype o WHERE o.oppTypeId = :oppTypeId"),
    @NamedQuery(name = "Opportunitytype.findByOppTypeName", query = "SELECT o FROM Opportunitytype o WHERE o.oppTypeName = :oppTypeName"),
    @NamedQuery(name = "Opportunitytype.findByCreatedOn", query = "SELECT o FROM Opportunitytype o WHERE o.createdOn = :createdOn"),
    @NamedQuery(name = "Opportunitytype.findByModifiedOn", query = "SELECT o FROM Opportunitytype o WHERE o.modifiedOn = :modifiedOn")})
public class Opportunitytype implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oppTypeId", nullable = false)
    private Integer oppTypeId;
    @Column(name = "oppTypeName", length = 45)
    private String oppTypeName;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @OneToMany(mappedBy = "oppurtunityTypeId")
    private Set<Oppurtunity> oppurtunitySet;

    public Opportunitytype() {
    }

    public Opportunitytype(Integer oppTypeId) {
        this.oppTypeId = oppTypeId;
    }

    public Integer getOppTypeId() {
        return oppTypeId;
    }

    public void setOppTypeId(Integer oppTypeId) {
        this.oppTypeId = oppTypeId;
    }

    public String getOppTypeName() {
        return oppTypeName;
    }

    public void setOppTypeName(String oppTypeName) {
        this.oppTypeName = oppTypeName;
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

    public Set<Oppurtunity> getOppurtunitySet() {
        return oppurtunitySet;
    }

    public void setOppurtunitySet(Set<Oppurtunity> oppurtunitySet) {
        this.oppurtunitySet = oppurtunitySet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oppTypeId != null ? oppTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opportunitytype)) {
            return false;
        }
        Opportunitytype other = (Opportunitytype) object;
        if ((this.oppTypeId == null && other.oppTypeId != null) || (this.oppTypeId != null && !this.oppTypeId.equals(other.oppTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Opportunitytype[oppTypeId=" + oppTypeId + "]";
    }

}

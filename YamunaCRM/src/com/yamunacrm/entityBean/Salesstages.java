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
@Table(name = "salesstages", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Salesstages.findAll", query = "SELECT s FROM Salesstages s"),
    @NamedQuery(name = "Salesstages.findBySaleStageId", query = "SELECT s FROM Salesstages s WHERE s.saleStageId = :saleStageId"),
    @NamedQuery(name = "Salesstages.findByStageName", query = "SELECT s FROM Salesstages s WHERE s.stageName = :stageName"),
    @NamedQuery(name = "Salesstages.findByIsActive", query = "SELECT s FROM Salesstages s WHERE s.isActive = :isActive"),
    @NamedQuery(name = "Salesstages.findByCreatedOn", query = "SELECT s FROM Salesstages s WHERE s.createdOn = :createdOn")})
public class Salesstages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = " saleStageId", nullable = false)
    private Integer saleStageId;
    @Column(name = "stageName", length = 45)
    private String stageName;
    @Column(name = "isActive")
    private Character isActive;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "saleStageId")
    private Set<Oppurtunitystatus> oppurtunitystatusSet;

    public Salesstages() {
    }

    public Salesstages(Integer saleStageId) {
        this.saleStageId = saleStageId;
    }

    public Integer getSaleStageId() {
        return saleStageId;
    }

    public void setSaleStageId(Integer saleStageId) {
        this.saleStageId = saleStageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Set<Oppurtunitystatus> getOppurtunitystatusSet() {
        return oppurtunitystatusSet;
    }

    public void setOppurtunitystatusSet(Set<Oppurtunitystatus> oppurtunitystatusSet) {
        this.oppurtunitystatusSet = oppurtunitystatusSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleStageId != null ? saleStageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesstages)) {
            return false;
        }
        Salesstages other = (Salesstages) object;
        if ((this.saleStageId == null && other.saleStageId != null) || (this.saleStageId != null && !this.saleStageId.equals(other.saleStageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Salesstages[saleStageId=" + saleStageId + "]";
    }

}

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
@Table(name = "status", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findByStatusId", query = "SELECT s FROM Status s WHERE s.statusId = :statusId"),
    @NamedQuery(name = "Status.findByStatusName", query = "SELECT s FROM Status s WHERE s.statusName = :statusName"),
    @NamedQuery(name = "Status.findByCreatedOn", query = "SELECT s FROM Status s WHERE s.createdOn = :createdOn"),
    @NamedQuery(name = "Status.findByIsActive", query = "SELECT s FROM Status s WHERE s.isActive = :isActive")})
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "statusId", nullable = false)
    private Integer statusId;
    @Basic(optional = false)
    @Column(name = "statusName", nullable = false, length = 45)
    private String statusName;
    @Basic(optional = false)
    @Column(name = "createdOn", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @Column(name = "isActive", nullable = false)
    private char isActive;
    @OneToMany(mappedBy = "statusId")
    private Set<Oppurtunitystatus> oppurtunitystatusSet;

    public Status() {
    }

    public Status(Integer statusId) {
        this.statusId = statusId;
    }

    public Status(Integer statusId, String statusName, Date createdOn, char isActive) {
        this.statusId = statusId;
        this.statusName = statusName;
        this.createdOn = createdOn;
        this.isActive = isActive;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
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
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Status[statusId=" + statusId + "]";
    }

}

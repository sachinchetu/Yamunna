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
@Table(name = "target", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Target.findAll", query = "SELECT t FROM Target t"),
    @NamedQuery(name = "Target.findByTargetId", query = "SELECT t FROM Target t WHERE t.targetId = :targetId"),
    @NamedQuery(name = "Target.findByStartDate", query = "SELECT t FROM Target t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "Target.findByEndDate", query = "SELECT t FROM Target t WHERE t.endDate = :endDate"),
    @NamedQuery(name = "Target.findByCreatedOn", query = "SELECT t FROM Target t WHERE t.createdOn = :createdOn"),
    @NamedQuery(name = "Target.findByModifiedOn", query = "SELECT t FROM Target t WHERE t.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Target.findByIsAchieved", query = "SELECT t FROM Target t WHERE t.isAchieved = :isAchieved")})
public class Target implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "targetId", nullable = false)
    private Integer targetId;
    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "isAchieved")
    private Character isAchieved;
    @OneToMany(mappedBy = "targetId")
    private Set<Usertargetmapping> usertargetmappingSet;
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @ManyToOne
    private Users userId;

    public Target() {
    }

    public Target(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Character getIsAchieved() {
        return isAchieved;
    }

    public void setIsAchieved(Character isAchieved) {
        this.isAchieved = isAchieved;
    }

    public Set<Usertargetmapping> getUsertargetmappingSet() {
        return usertargetmappingSet;
    }

    public void setUsertargetmappingSet(Set<Usertargetmapping> usertargetmappingSet) {
        this.usertargetmappingSet = usertargetmappingSet;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (targetId != null ? targetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Target)) {
            return false;
        }
        Target other = (Target) object;
        if ((this.targetId == null && other.targetId != null) || (this.targetId != null && !this.targetId.equals(other.targetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Target[targetId=" + targetId + "]";
    }

}

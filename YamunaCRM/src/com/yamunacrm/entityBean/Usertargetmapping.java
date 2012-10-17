/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "usertargetmapping", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usertargetmapping.findAll", query = "SELECT u FROM Usertargetmapping u"),
    @NamedQuery(name = "Usertargetmapping.findByUserTargetMappingId", query = "SELECT u FROM Usertargetmapping u WHERE u.userTargetMappingId = :userTargetMappingId"),
    @NamedQuery(name = "Usertargetmapping.findByCreatedOn", query = "SELECT u FROM Usertargetmapping u WHERE u.createdOn = :createdOn"),
    @NamedQuery(name = "Usertargetmapping.findByModifiedOn", query = "SELECT u FROM Usertargetmapping u WHERE u.modifiedOn = :modifiedOn")})
public class Usertargetmapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UserTargetMappingId", nullable = false)
    private Integer userTargetMappingId;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @ManyToOne
    private Users userId;
    @JoinColumn(name = "targetId", referencedColumnName = "targetId")
    @ManyToOne
    private Target targetId;

    public Usertargetmapping() {
    }

    public Usertargetmapping(Integer userTargetMappingId) {
        this.userTargetMappingId = userTargetMappingId;
    }

    public Integer getUserTargetMappingId() {
        return userTargetMappingId;
    }

    public void setUserTargetMappingId(Integer userTargetMappingId) {
        this.userTargetMappingId = userTargetMappingId;
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

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Target getTargetId() {
        return targetId;
    }

    public void setTargetId(Target targetId) {
        this.targetId = targetId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userTargetMappingId != null ? userTargetMappingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usertargetmapping)) {
            return false;
        }
        Usertargetmapping other = (Usertargetmapping) object;
        if ((this.userTargetMappingId == null && other.userTargetMappingId != null) || (this.userTargetMappingId != null && !this.userTargetMappingId.equals(other.userTargetMappingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Usertargetmapping[userTargetMappingId=" + userTargetMappingId + "]";
    }

}

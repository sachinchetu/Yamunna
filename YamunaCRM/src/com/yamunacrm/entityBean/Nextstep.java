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
@Table(name = "nextstep", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nextstep.findAll", query = "SELECT n FROM Nextstep n"),
    @NamedQuery(name = "Nextstep.findByStepId", query = "SELECT n FROM Nextstep n WHERE n.stepId = :stepId"),
    @NamedQuery(name = "Nextstep.findByStepName", query = "SELECT n FROM Nextstep n WHERE n.stepName = :stepName"),
    @NamedQuery(name = "Nextstep.findByCreatedOn", query = "SELECT n FROM Nextstep n WHERE n.createdOn = :createdOn"),
    @NamedQuery(name = "Nextstep.findByIsActive", query = "SELECT n FROM Nextstep n WHERE n.isActive = :isActive")})
public class Nextstep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "stepId", nullable = false)
    private Integer stepId;
    @Column(name = "stepName", length = 45)
    private String stepName;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "isActive")
    private Character isActive;
    @OneToMany(mappedBy = "stepId")
    private Set<Oppurtunitystatus> oppurtunitystatusSet;

    public Nextstep() {
    }

    public Nextstep(Integer stepId) {
        this.stepId = stepId;
    }

    public Integer getStepId() {
        return stepId;
    }

    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
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
        hash += (stepId != null ? stepId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nextstep)) {
            return false;
        }
        Nextstep other = (Nextstep) object;
        if ((this.stepId == null && other.stepId != null) || (this.stepId != null && !this.stepId.equals(other.stepId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Nextstep[stepId=" + stepId + "]";
    }

}

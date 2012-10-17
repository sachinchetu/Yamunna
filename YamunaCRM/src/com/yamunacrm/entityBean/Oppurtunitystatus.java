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
@Table(name = "oppurtunitystatus", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Oppurtunitystatus.findAll", query = "SELECT o FROM Oppurtunitystatus o"),
    @NamedQuery(name = "Oppurtunitystatus.findByOppStatusID", query = "SELECT o FROM Oppurtunitystatus o WHERE o.oppStatusID = :oppStatusID"),
    @NamedQuery(name = "Oppurtunitystatus.findByDescription", query = "SELECT o FROM Oppurtunitystatus o WHERE o.description = :description"),
    @NamedQuery(name = "Oppurtunitystatus.findByDate", query = "SELECT o FROM Oppurtunitystatus o WHERE o.date = :date")})
public class Oppurtunitystatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oppStatusID", nullable = false)
    private Integer oppStatusID;
    @Column(name = "description", length = 45)
    private String description;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "stepId", referencedColumnName = "stepId")
    @ManyToOne
    private Nextstep stepId;
    @JoinColumn(name = "statusId", referencedColumnName = "statusId")
    @ManyToOne
    private Status statusId;
    @JoinColumn(name = "oppId", referencedColumnName = "oppId", nullable = false)
    @ManyToOne(optional = false)
    private Oppurtunity oppId;
    @JoinColumn(name = "saleStageId", referencedColumnName = " saleStageId", nullable = false)
    @ManyToOne(optional = false)
    private Salesstages saleStageId;

    public Oppurtunitystatus() {
    }

    public Oppurtunitystatus(Integer oppStatusID) {
        this.oppStatusID = oppStatusID;
    }

    public Integer getOppStatusID() {
        return oppStatusID;
    }

    public void setOppStatusID(Integer oppStatusID) {
        this.oppStatusID = oppStatusID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Nextstep getStepId() {
        return stepId;
    }

    public void setStepId(Nextstep stepId) {
        this.stepId = stepId;
    }

    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }

    public Oppurtunity getOppId() {
        return oppId;
    }

    public void setOppId(Oppurtunity oppId) {
        this.oppId = oppId;
    }

    public Salesstages getSaleStageId() {
        return saleStageId;
    }

    public void setSaleStageId(Salesstages saleStageId) {
        this.saleStageId = saleStageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oppStatusID != null ? oppStatusID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oppurtunitystatus)) {
            return false;
        }
        Oppurtunitystatus other = (Oppurtunitystatus) object;
        if ((this.oppStatusID == null && other.oppStatusID != null) || (this.oppStatusID != null && !this.oppStatusID.equals(other.oppStatusID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Oppurtunitystatus[oppStatusID=" + oppStatusID + "]";
    }

}

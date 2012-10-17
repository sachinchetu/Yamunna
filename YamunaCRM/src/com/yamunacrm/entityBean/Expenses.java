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
@Table(name = "expenses", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Expenses.findAll", query = "SELECT e FROM Expenses e"),
    @NamedQuery(name = "Expenses.findByExpenseId", query = "SELECT e FROM Expenses e WHERE e.expenseId = :expenseId"),
    @NamedQuery(name = "Expenses.findByExpenseType", query = "SELECT e FROM Expenses e WHERE e.expenseType = :expenseType"),
    @NamedQuery(name = "Expenses.findByDescription", query = "SELECT e FROM Expenses e WHERE e.description = :description"),
    @NamedQuery(name = "Expenses.findByModeOfConveyance", query = "SELECT e FROM Expenses e WHERE e.modeOfConveyance = :modeOfConveyance"),
    @NamedQuery(name = "Expenses.findByAmount", query = "SELECT e FROM Expenses e WHERE e.amount = :amount"),
    @NamedQuery(name = "Expenses.findByStartDate", query = "SELECT e FROM Expenses e WHERE e.startDate = :startDate"),
    @NamedQuery(name = "Expenses.findByEndDate", query = "SELECT e FROM Expenses e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "Expenses.findByNumberOfDays", query = "SELECT e FROM Expenses e WHERE e.numberOfDays = :numberOfDays"),
    @NamedQuery(name = "Expenses.findByDistanceInKm", query = "SELECT e FROM Expenses e WHERE e.distanceInKm = :distanceInKm"),
    @NamedQuery(name = "Expenses.findByTourName", query = "SELECT e FROM Expenses e WHERE e.tourName = :tourName"),
    @NamedQuery(name = "Expenses.findByPurposeOfTravel", query = "SELECT e FROM Expenses e WHERE e.purposeOfTravel = :purposeOfTravel"),
    @NamedQuery(name = "Expenses.findByStationVisited", query = "SELECT e FROM Expenses e WHERE e.stationVisited = :stationVisited"),
    @NamedQuery(name = "Expenses.findByClassOfConveyance", query = "SELECT e FROM Expenses e WHERE e.classOfConveyance = :classOfConveyance")})
public class Expenses implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "expenseId", nullable = false)
    private Integer expenseId;
    @Column(name = "expenseType", length = 45)
    private String expenseType;
    @Column(name = "Description", length = 45)
    private String description;
    @Column(name = "modeOfConveyance", length = 20)
    private String modeOfConveyance;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "numberOfDays")
    private Integer numberOfDays;
    @Column(name = "distanceInKm")
    private Integer distanceInKm;
    @Column(name = "tourName", length = 45)
    private String tourName;
    @Column(name = "purposeOfTravel", length = 45)
    private String purposeOfTravel;
    @Column(name = "stationVisited", length = 45)
    private String stationVisited;
    @Column(name = "classOfConveyance", length = 45)
    private String classOfConveyance;
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @ManyToOne
    private Users userId;
    @JoinColumn(name = "tourOrderedBy", referencedColumnName = "userId")
    @ManyToOne
    private Users tourOrderedBy;
    @JoinColumn(name = "appointmentId", referencedColumnName = "appointmentId", nullable = false)
    @ManyToOne(optional = false)
    private Appointment appointmentId;
    @JoinColumn(name = "tourSanctionedBy", referencedColumnName = "userId")
    @ManyToOne
    private Users tourSanctionedBy;

    public Expenses() {
    }

    public Expenses(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModeOfConveyance() {
        return modeOfConveyance;
    }

    public void setModeOfConveyance(String modeOfConveyance) {
        this.modeOfConveyance = modeOfConveyance;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public Integer getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(Integer distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getPurposeOfTravel() {
        return purposeOfTravel;
    }

    public void setPurposeOfTravel(String purposeOfTravel) {
        this.purposeOfTravel = purposeOfTravel;
    }

    public String getStationVisited() {
        return stationVisited;
    }

    public void setStationVisited(String stationVisited) {
        this.stationVisited = stationVisited;
    }

    public String getClassOfConveyance() {
        return classOfConveyance;
    }

    public void setClassOfConveyance(String classOfConveyance) {
        this.classOfConveyance = classOfConveyance;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Users getTourOrderedBy() {
        return tourOrderedBy;
    }

    public void setTourOrderedBy(Users tourOrderedBy) {
        this.tourOrderedBy = tourOrderedBy;
    }

    public Appointment getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Appointment appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Users getTourSanctionedBy() {
        return tourSanctionedBy;
    }

    public void setTourSanctionedBy(Users tourSanctionedBy) {
        this.tourSanctionedBy = tourSanctionedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (expenseId != null ? expenseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expenses)) {
            return false;
        }
        Expenses other = (Expenses) object;
        if ((this.expenseId == null && other.expenseId != null) || (this.expenseId != null && !this.expenseId.equals(other.expenseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Expenses[expenseId=" + expenseId + "]";
    }

}

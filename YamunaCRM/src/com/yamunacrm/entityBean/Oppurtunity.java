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
@Table(name = "oppurtunity", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Oppurtunity.findAll", query = "SELECT o FROM Oppurtunity o"),
    @NamedQuery(name = "Oppurtunity.findByOppId", query = "SELECT o FROM Oppurtunity o WHERE o.oppId = :oppId"),
    @NamedQuery(name = "Oppurtunity.findByAssignedOn", query = "SELECT o FROM Oppurtunity o WHERE o.assignedOn = :assignedOn"),
    @NamedQuery(name = "Oppurtunity.findByStatusId", query = "SELECT o FROM Oppurtunity o WHERE o.statusId = :statusId"),
    @NamedQuery(name = "Oppurtunity.findByProductId", query = "SELECT o FROM Oppurtunity o WHERE o.productId = :productId"),
    @NamedQuery(name = "Oppurtunity.findByEstimatedCloseDate", query = "SELECT o FROM Oppurtunity o WHERE o.estimatedCloseDate = :estimatedCloseDate"),
    @NamedQuery(name = "Oppurtunity.findByCloseDate", query = "SELECT o FROM Oppurtunity o WHERE o.closeDate = :closeDate"),
    @NamedQuery(name = "Oppurtunity.findByDescription", query = "SELECT o FROM Oppurtunity o WHERE o.description = :description"),
    @NamedQuery(name = "Oppurtunity.findByOppurtunityName", query = "SELECT o FROM Oppurtunity o WHERE o.oppurtunityName = :oppurtunityName"),
    @NamedQuery(name = "Oppurtunity.findByTerritoryId", query = "SELECT o FROM Oppurtunity o WHERE o.territoryId = :territoryId"),
    @NamedQuery(name = "Oppurtunity.findByOppurtunityPhaseId", query = "SELECT o FROM Oppurtunity o WHERE o.oppurtunityPhaseId = :oppurtunityPhaseId"),
    @NamedQuery(name = "Oppurtunity.findByLastDateOfSubmittal", query = "SELECT o FROM Oppurtunity o WHERE o.lastDateOfSubmittal = :lastDateOfSubmittal"),
    @NamedQuery(name = "Oppurtunity.findByCurrency", query = "SELECT o FROM Oppurtunity o WHERE o.currency = :currency"),
    @NamedQuery(name = "Oppurtunity.findByIsSampleRequired", query = "SELECT o FROM Oppurtunity o WHERE o.isSampleRequired = :isSampleRequired")})
public class Oppurtunity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oppId", nullable = false)
    private Integer oppId;
    @Column(name = "assignedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assignedOn;
    @Column(name = "statusId")
    private Integer statusId;
    @Column(name = "productId")
    private Integer productId;
    @Column(name = "estimatedCloseDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedCloseDate;
    @Column(name = "closeDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closeDate;
    @Column(name = "description", length = 45)
    private String description;
    @Column(name = "oppurtunityName")
    private Integer oppurtunityName;
    @Column(name = "territoryId")
    private Integer territoryId;
    @Column(name = "oppurtunityPhaseId")
    private Integer oppurtunityPhaseId;
    @Column(name = "lastDateOfSubmittal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastDateOfSubmittal;
    @Column(name = "currency", length = 45)
    private String currency;
    @Column(name = "isSampleRequired")
    private Character isSampleRequired;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oppId")
    private Set<Billingdetails> billingdetailsSet;
    @JoinColumn(name = "oppurtunityTypeId", referencedColumnName = "oppTypeId")
    @ManyToOne
    private Opportunitytype oppurtunityTypeId;
    @JoinColumn(name = "sourceId", referencedColumnName = "sourceId")
    @ManyToOne
    private Source sourceId;
    @JoinColumn(name = "oppurtunityRatingId", referencedColumnName = "oppurtunityRatingId")
    @ManyToOne
    private Oppurtunityrating oppurtunityRatingId;
    @JoinColumn(name = "industryId", referencedColumnName = "industryId")
    @ManyToOne
    private Industry industryId;
    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    @ManyToOne
    private Contacts contactId;
    @JoinColumn(name = "assignedTo", referencedColumnName = "userId")
    @ManyToOne
    private Users assignedTo;
    @JoinColumn(name = "assignedBy", referencedColumnName = "userId")
    @ManyToOne
    private Users assignedBy;
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    @ManyToOne
    private Companyaccount accountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "oppId")
    private Set<Oppurtunitystatus> oppurtunitystatusSet;

    public Oppurtunity() {
    }

    public Oppurtunity(Integer oppId) {
        this.oppId = oppId;
    }

    public Integer getOppId() {
        return oppId;
    }

    public void setOppId(Integer oppId) {
        this.oppId = oppId;
    }

    public Date getAssignedOn() {
        return assignedOn;
    }

    public void setAssignedOn(Date assignedOn) {
        this.assignedOn = assignedOn;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    public void setEstimatedCloseDate(Date estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOppurtunityName() {
        return oppurtunityName;
    }

    public void setOppurtunityName(Integer oppurtunityName) {
        this.oppurtunityName = oppurtunityName;
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public Integer getOppurtunityPhaseId() {
        return oppurtunityPhaseId;
    }

    public void setOppurtunityPhaseId(Integer oppurtunityPhaseId) {
        this.oppurtunityPhaseId = oppurtunityPhaseId;
    }

    public Date getLastDateOfSubmittal() {
        return lastDateOfSubmittal;
    }

    public void setLastDateOfSubmittal(Date lastDateOfSubmittal) {
        this.lastDateOfSubmittal = lastDateOfSubmittal;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Character getIsSampleRequired() {
        return isSampleRequired;
    }

    public void setIsSampleRequired(Character isSampleRequired) {
        this.isSampleRequired = isSampleRequired;
    }

    public Set<Billingdetails> getBillingdetailsSet() {
        return billingdetailsSet;
    }

    public void setBillingdetailsSet(Set<Billingdetails> billingdetailsSet) {
        this.billingdetailsSet = billingdetailsSet;
    }

    public Opportunitytype getOppurtunityTypeId() {
        return oppurtunityTypeId;
    }

    public void setOppurtunityTypeId(Opportunitytype oppurtunityTypeId) {
        this.oppurtunityTypeId = oppurtunityTypeId;
    }

    public Source getSourceId() {
        return sourceId;
    }

    public void setSourceId(Source sourceId) {
        this.sourceId = sourceId;
    }

    public Oppurtunityrating getOppurtunityRatingId() {
        return oppurtunityRatingId;
    }

    public void setOppurtunityRatingId(Oppurtunityrating oppurtunityRatingId) {
        this.oppurtunityRatingId = oppurtunityRatingId;
    }

    public Industry getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Industry industryId) {
        this.industryId = industryId;
    }

    public Contacts getContactId() {
        return contactId;
    }

    public void setContactId(Contacts contactId) {
        this.contactId = contactId;
    }

    public Users getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Users assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Users getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(Users assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Companyaccount getAccountId() {
        return accountId;
    }

    public void setAccountId(Companyaccount accountId) {
        this.accountId = accountId;
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
        hash += (oppId != null ? oppId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oppurtunity)) {
            return false;
        }
        Oppurtunity other = (Oppurtunity) object;
        if ((this.oppId == null && other.oppId != null) || (this.oppId != null && !this.oppId.equals(other.oppId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Oppurtunity[oppId=" + oppId + "]";
    }

}

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
@Table(name = "contacts", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contacts.findAll", query = "SELECT c FROM Contacts c"),
    @NamedQuery(name = "Contacts.findByContactId", query = "SELECT c FROM Contacts c WHERE c.contactId = :contactId"),
    @NamedQuery(name = "Contacts.findByTitle", query = "SELECT c FROM Contacts c WHERE c.title = :title"),
    @NamedQuery(name = "Contacts.findByFirstName", query = "SELECT c FROM Contacts c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Contacts.findByLastName", query = "SELECT c FROM Contacts c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Contacts.findByMiddleName", query = "SELECT c FROM Contacts c WHERE c.middleName = :middleName"),
    @NamedQuery(name = "Contacts.findByGender", query = "SELECT c FROM Contacts c WHERE c.gender = :gender"),
    @NamedQuery(name = "Contacts.findByJobTitle", query = "SELECT c FROM Contacts c WHERE c.jobTitle = :jobTitle"),
    @NamedQuery(name = "Contacts.findByWorkPhone", query = "SELECT c FROM Contacts c WHERE c.workPhone = :workPhone"),
    @NamedQuery(name = "Contacts.findByResPhone", query = "SELECT c FROM Contacts c WHERE c.resPhone = :resPhone"),
    @NamedQuery(name = "Contacts.findByMobileNo", query = "SELECT c FROM Contacts c WHERE c.mobileNo = :mobileNo"),
    @NamedQuery(name = "Contacts.findByEmail", query = "SELECT c FROM Contacts c WHERE c.email = :email"),
    @NamedQuery(name = "Contacts.findByDescription", query = "SELECT c FROM Contacts c WHERE c.description = :description"),
    @NamedQuery(name = "Contacts.findByDepartement", query = "SELECT c FROM Contacts c WHERE c.departement = :departement"),
    @NamedQuery(name = "Contacts.findByCreatedOn", query = "SELECT c FROM Contacts c WHERE c.createdOn = :createdOn"),
    @NamedQuery(name = "Contacts.findByModifiedOn", query = "SELECT c FROM Contacts c WHERE c.modifiedOn = :modifiedOn")})
public class Contacts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "contactId", nullable = false)
    private Integer contactId;
    @Column(name = "title", length = 45)
    private String title;
    @Column(name = "firstName", length = 45)
    private String firstName;
    @Column(name = "lastName", length = 45)
    private String lastName;
    @Column(name = "middleName", length = 45)
    private String middleName;
    @Column(name = "Gender", length = 45)
    private String gender;
    @Column(name = "jobTitle", length = 20)
    private String jobTitle;
    @Column(name = "workPhone")
    private Integer workPhone;
    @Column(name = "resPhone")
    private Integer resPhone;
    @Column(name = "mobileNo")
    private Integer mobileNo;
    @Column(name = "email", length = 45)
    private String email;
    @Column(name = "description", length = 45)
    private String description;
    @Column(name = "departement", length = 45)
    private String departement;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    @ManyToOne
    private Companyaccount accountId;
    @JoinColumn(name = "sourceId", referencedColumnName = "sourceId")
    @ManyToOne
    private Source sourceId;
    @OneToMany(mappedBy = "contactId")
    private Set<Appointment> appointmentSet;
    @OneToMany(mappedBy = "contactId")
    private Set<Oppurtunity> oppurtunitySet;

    public Contacts() {
    }

    public Contacts(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(Integer workPhone) {
        this.workPhone = workPhone;
    }

    public Integer getResPhone() {
        return resPhone;
    }

    public void setResPhone(Integer resPhone) {
        this.resPhone = resPhone;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
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

    public Companyaccount getAccountId() {
        return accountId;
    }

    public void setAccountId(Companyaccount accountId) {
        this.accountId = accountId;
    }

    public Source getSourceId() {
        return sourceId;
    }

    public void setSourceId(Source sourceId) {
        this.sourceId = sourceId;
    }

    public Set<Appointment> getAppointmentSet() {
        return appointmentSet;
    }

    public void setAppointmentSet(Set<Appointment> appointmentSet) {
        this.appointmentSet = appointmentSet;
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
        hash += (contactId != null ? contactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacts)) {
            return false;
        }
        Contacts other = (Contacts) object;
        if ((this.contactId == null && other.contactId != null) || (this.contactId != null && !this.contactId.equals(other.contactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Contacts[contactId=" + contactId + "]";
    }

}

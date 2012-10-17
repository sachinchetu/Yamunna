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
@Table(name = "billingdetails", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Billingdetails.findAll", query = "SELECT b FROM Billingdetails b"),
    @NamedQuery(name = "Billingdetails.findByBillingId", query = "SELECT b FROM Billingdetails b WHERE b.billingId = :billingId"),
    @NamedQuery(name = "Billingdetails.findByBillingStreet", query = "SELECT b FROM Billingdetails b WHERE b.billingStreet = :billingStreet"),
    @NamedQuery(name = "Billingdetails.findByBillingCity", query = "SELECT b FROM Billingdetails b WHERE b.billingCity = :billingCity"),
    @NamedQuery(name = "Billingdetails.findByBillingState", query = "SELECT b FROM Billingdetails b WHERE b.billingState = :billingState"),
    @NamedQuery(name = "Billingdetails.findByBillingPostalCode", query = "SELECT b FROM Billingdetails b WHERE b.billingPostalCode = :billingPostalCode"),
    @NamedQuery(name = "Billingdetails.findByBillingCountry", query = "SELECT b FROM Billingdetails b WHERE b.billingCountry = :billingCountry"),
    @NamedQuery(name = "Billingdetails.findByShippingStreet", query = "SELECT b FROM Billingdetails b WHERE b.shippingStreet = :shippingStreet"),
    @NamedQuery(name = "Billingdetails.findByShippingCity", query = "SELECT b FROM Billingdetails b WHERE b.shippingCity = :shippingCity"),
    @NamedQuery(name = "Billingdetails.findByShippingState", query = "SELECT b FROM Billingdetails b WHERE b.shippingState = :shippingState"),
    @NamedQuery(name = "Billingdetails.findByShippingPostalCode", query = "SELECT b FROM Billingdetails b WHERE b.shippingPostalCode = :shippingPostalCode"),
    @NamedQuery(name = "Billingdetails.findByShippingCountry", query = "SELECT b FROM Billingdetails b WHERE b.shippingCountry = :shippingCountry"),
    @NamedQuery(name = "Billingdetails.findByCreatedOn", query = "SELECT b FROM Billingdetails b WHERE b.createdOn = :createdOn")})
public class Billingdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "billingId", nullable = false)
    private Integer billingId;
    @Column(name = "billingStreet", length = 45)
    private String billingStreet;
    @Column(name = "billingCity", length = 45)
    private String billingCity;
    @Column(name = "billingState", length = 45)
    private String billingState;
    @Column(name = "billingPostalCode", length = 45)
    private String billingPostalCode;
    @Column(name = "billingCountry", length = 45)
    private String billingCountry;
    @Column(name = "shippingStreet", length = 45)
    private String shippingStreet;
    @Column(name = "shippingCity", length = 45)
    private String shippingCity;
    @Column(name = "shippingState", length = 45)
    private String shippingState;
    @Column(name = "shippingPostalCode", length = 45)
    private String shippingPostalCode;
    @Column(name = "shippingCountry", length = 45)
    private String shippingCountry;
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @JoinColumn(name = "oppId", referencedColumnName = "oppId", nullable = false)
    @ManyToOne(optional = false)
    private Oppurtunity oppId;

    public Billingdetails() {
    }

    public Billingdetails(Integer billingId) {
        this.billingId = billingId;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingPostalCode() {
        return shippingPostalCode;
    }

    public void setShippingPostalCode(String shippingPostalCode) {
        this.shippingPostalCode = shippingPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Oppurtunity getOppId() {
        return oppId;
    }

    public void setOppId(Oppurtunity oppId) {
        this.oppId = oppId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billingId != null ? billingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billingdetails)) {
            return false;
        }
        Billingdetails other = (Billingdetails) object;
        if ((this.billingId == null && other.billingId != null) || (this.billingId != null && !this.billingId.equals(other.billingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Billingdetails[billingId=" + billingId + "]";
    }

}

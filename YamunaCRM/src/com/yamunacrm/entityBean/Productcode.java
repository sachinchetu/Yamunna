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
@Table(name = "productcode", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Productcode.findAll", query = "SELECT p FROM Productcode p"),
    @NamedQuery(name = "Productcode.findByProductCodeId", query = "SELECT p FROM Productcode p WHERE p.productCodeId = :productCodeId"),
    @NamedQuery(name = "Productcode.findByProductCode", query = "SELECT p FROM Productcode p WHERE p.productCode = :productCode"),
    @NamedQuery(name = "Productcode.findByIsActive", query = "SELECT p FROM Productcode p WHERE p.isActive = :isActive"),
    @NamedQuery(name = "Productcode.findByStartDate", query = "SELECT p FROM Productcode p WHERE p.startDate = :startDate"),
    @NamedQuery(name = "Productcode.findByEndDate", query = "SELECT p FROM Productcode p WHERE p.endDate = :endDate")})
public class Productcode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "productCodeId", nullable = false)
    private Integer productCodeId;
    @Basic(optional = false)
    @Column(name = "productCode", nullable = false)
    private int productCode;
    @Basic(optional = false)
    @Column(name = "isActive", nullable = false)
    private char isActive;
    @Basic(optional = false)
    @Column(name = "startDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Basic(optional = false)
    @Column(name = "endDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productCodeId")
    private Set<Productitems> productitemsSet;
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    @ManyToOne
    private Product productId;

    public Productcode() {
    }

    public Productcode(Integer productCodeId) {
        this.productCodeId = productCodeId;
    }

    public Productcode(Integer productCodeId, int productCode, char isActive, Date startDate, Date endDate) {
        this.productCodeId = productCodeId;
        this.productCode = productCode;
        this.isActive = isActive;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getProductCodeId() {
        return productCodeId;
    }

    public void setProductCodeId(Integer productCodeId) {
        this.productCodeId = productCodeId;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
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

    public Set<Productitems> getProductitemsSet() {
        return productitemsSet;
    }

    public void setProductitemsSet(Set<Productitems> productitemsSet) {
        this.productitemsSet = productitemsSet;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productCodeId != null ? productCodeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productcode)) {
            return false;
        }
        Productcode other = (Productcode) object;
        if ((this.productCodeId == null && other.productCodeId != null) || (this.productCodeId != null && !this.productCodeId.equals(other.productCodeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Productcode[productCodeId=" + productCodeId + "]";
    }

}

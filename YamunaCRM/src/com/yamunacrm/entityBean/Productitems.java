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
@Table(name = "productitems", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Productitems.findAll", query = "SELECT p FROM Productitems p"),
    @NamedQuery(name = "Productitems.findByItemId", query = "SELECT p FROM Productitems p WHERE p.itemId = :itemId"),
    @NamedQuery(name = "Productitems.findByItemCode", query = "SELECT p FROM Productitems p WHERE p.itemCode = :itemCode"),
    @NamedQuery(name = "Productitems.findByItemName", query = "SELECT p FROM Productitems p WHERE p.itemName = :itemName"),
    @NamedQuery(name = "Productitems.findByModifiedOn", query = "SELECT p FROM Productitems p WHERE p.modifiedOn = :modifiedOn"),
    @NamedQuery(name = "Productitems.findByStartDate", query = "SELECT p FROM Productitems p WHERE p.startDate = :startDate"),
    @NamedQuery(name = "Productitems.findByEndDate", query = "SELECT p FROM Productitems p WHERE p.endDate = :endDate"),
    @NamedQuery(name = "Productitems.findByIsActive", query = "SELECT p FROM Productitems p WHERE p.isActive = :isActive")})
public class Productitems implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "itemId", nullable = false)
    private Integer itemId;
    @Basic(optional = false)
    @Column(name = "itemCode", nullable = false, length = 20)
    private String itemCode;
    @Column(name = "itemName", length = 45)
    private String itemName;
    @Column(name = "modifiedOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedOn;
    @Column(name = "startDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "endDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "isActive")
    private Character isActive;
    @JoinColumn(name = "productCodeId", referencedColumnName = "productCodeId", nullable = false)
    @ManyToOne(optional = false)
    private Productcode productCodeId;

    public Productitems() {
    }

    public Productitems(Integer itemId) {
        this.itemId = itemId;
    }

    public Productitems(Integer itemId, String itemCode) {
        this.itemId = itemId;
        this.itemCode = itemCode;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
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

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public Productcode getProductCodeId() {
        return productCodeId;
    }

    public void setProductCodeId(Productcode productCodeId) {
        this.productCodeId = productCodeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productitems)) {
            return false;
        }
        Productitems other = (Productitems) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Productitems[itemId=" + itemId + "]";
    }

}

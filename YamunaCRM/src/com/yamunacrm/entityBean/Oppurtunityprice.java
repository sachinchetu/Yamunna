/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.entityBean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "oppurtunityprice", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Oppurtunityprice.findAll", query = "SELECT o FROM Oppurtunityprice o"),
    @NamedQuery(name = "Oppurtunityprice.findByOppId", query = "SELECT o FROM Oppurtunityprice o WHERE o.oppId = :oppId"),
    @NamedQuery(name = "Oppurtunityprice.findByOppurtunityId", query = "SELECT o FROM Oppurtunityprice o WHERE o.oppurtunityId = :oppurtunityId"),
    @NamedQuery(name = "Oppurtunityprice.findByPrice", query = "SELECT o FROM Oppurtunityprice o WHERE o.price = :price")})
public class Oppurtunityprice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "oppId", nullable = false)
    private Integer oppId;
    @Column(name = "oppurtunityId", length = 45)
    private String oppurtunityId;
    @Column(name = "price")
    private Integer price;

    public Oppurtunityprice() {
    }

    public Oppurtunityprice(Integer oppId) {
        this.oppId = oppId;
    }

    public Integer getOppId() {
        return oppId;
    }

    public void setOppId(Integer oppId) {
        this.oppId = oppId;
    }

    public String getOppurtunityId() {
        return oppurtunityId;
    }

    public void setOppurtunityId(String oppurtunityId) {
        this.oppurtunityId = oppurtunityId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
        if (!(object instanceof Oppurtunityprice)) {
            return false;
        }
        Oppurtunityprice other = (Oppurtunityprice) object;
        if ((this.oppId == null && other.oppId != null) || (this.oppId != null && !this.oppId.equals(other.oppId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Oppurtunityprice[oppId=" + oppId + "]";
    }

}

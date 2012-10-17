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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jaideepr
 */
@Entity
@Table(name = "accountindustrymapping", catalog = "yamunnadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Accountindustrymapping.findAll", query = "SELECT a FROM Accountindustrymapping a"),
    @NamedQuery(name = "Accountindustrymapping.findByAccountIndustryMappingId", query = "SELECT a FROM Accountindustrymapping a WHERE a.accountIndustryMappingId = :accountIndustryMappingId")})
public class Accountindustrymapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "accountIndustryMappingId", nullable = false)
    private Integer accountIndustryMappingId;
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    @ManyToOne
    private Companyaccount accountId;
    @JoinColumn(name = "industryId", referencedColumnName = "industryId")
    @ManyToOne
    private Industry industryId;

    public Accountindustrymapping() {
    }

    public Accountindustrymapping(Integer accountIndustryMappingId) {
        this.accountIndustryMappingId = accountIndustryMappingId;
    }

    public Integer getAccountIndustryMappingId() {
        return accountIndustryMappingId;
    }

    public void setAccountIndustryMappingId(Integer accountIndustryMappingId) {
        this.accountIndustryMappingId = accountIndustryMappingId;
    }

    public Companyaccount getAccountId() {
        return accountId;
    }

    public void setAccountId(Companyaccount accountId) {
        this.accountId = accountId;
    }

    public Industry getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Industry industryId) {
        this.industryId = industryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountIndustryMappingId != null ? accountIndustryMappingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accountindustrymapping)) {
            return false;
        }
        Accountindustrymapping other = (Accountindustrymapping) object;
        if ((this.accountIndustryMappingId == null && other.accountIndustryMappingId != null) || (this.accountIndustryMappingId != null && !this.accountIndustryMappingId.equals(other.accountIndustryMappingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yamuna.entityBean.Accountindustrymapping[accountIndustryMappingId=" + accountIndustryMappingId + "]";
    }

}

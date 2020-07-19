/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Njoftimi_Lloji")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NjoftimiLloji.findAll", query = "SELECT n FROM NjoftimiLloji n")
    , @NamedQuery(name = "NjoftimiLloji.findByLlojiID", query = "SELECT n FROM NjoftimiLloji n WHERE n.llojiID = :llojiID")
    , @NamedQuery(name = "NjoftimiLloji.findByEmertimi", query = "SELECT n FROM NjoftimiLloji n WHERE n.emertimi = :emertimi")})
public class NjoftimiLloji implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LlojiID")
    private Integer llojiID;
    @Column(name = "Emertimi")
    private String emertimi;
    @OneToMany(mappedBy = "llojiId")
    private Collection<Njoftimi> njoftimiCollection;

    public NjoftimiLloji() {
    }

    public NjoftimiLloji(Integer llojiID) {
        this.llojiID = llojiID;
    }

    public Integer getLlojiID() {
        return llojiID;
    }

    public void setLlojiID(Integer llojiID) {
        this.llojiID = llojiID;
    }

    public String getEmertimi() {
        return emertimi;
    }

    public void setEmertimi(String emertimi) {
        this.emertimi = emertimi;
    }

    @XmlTransient
    public Collection<Njoftimi> getNjoftimiCollection() {
        return njoftimiCollection;
    }

    public void setNjoftimiCollection(Collection<Njoftimi> njoftimiCollection) {
        this.njoftimiCollection = njoftimiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (llojiID != null ? llojiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NjoftimiLloji)) {
            return false;
        }
        NjoftimiLloji other = (NjoftimiLloji) object;
        if ((this.llojiID == null && other.llojiID != null) || (this.llojiID != null && !this.llojiID.equals(other.llojiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " +this.getEmertimi();
    }
    
}

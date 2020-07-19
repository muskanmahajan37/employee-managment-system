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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Pushimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pushimi.findAll", query = "SELECT p FROM Pushimi p")
    , @NamedQuery(name = "Pushimi.findByPushimiID", query = "SELECT p FROM Pushimi p WHERE p.pushimiID = :pushimiID")
    , @NamedQuery(name = "Pushimi.findByEmriPushimit", query = "SELECT p FROM Pushimi p WHERE p.emriPushimit = :emriPushimit")
    , @NamedQuery(name = "Pushimi.findByDitet", query = "SELECT p FROM Pushimi p WHERE p.ditet = :ditet")})
public class Pushimi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pushimiID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer pushimiID;
    @Column(name = "emri_pushimit")
    private String emriPushimit;
    @Column(name = "ditet")
    private Integer ditet;
    @OneToMany(mappedBy = "pushimiID")
    private Collection<PushimiPunetori> pushimiPunetoriCollection;

    public Pushimi() {
    }

    public Pushimi(Integer pushimiID) {
        this.pushimiID = pushimiID;
    }

    public Integer getPushimiID() {
        return pushimiID;
    }

    public void setPushimiID(Integer pushimiID) {
        this.pushimiID = pushimiID;
    }

    public String getEmriPushimit() {
        return emriPushimit;
    }

    public void setEmriPushimit(String emriPushimit) {
        this.emriPushimit = emriPushimit;
    }

    public Integer getDitet() {
        return ditet;
    }

    public void setDitet(Integer ditet) {
        this.ditet = ditet;
    }

    @XmlTransient
    public Collection<PushimiPunetori> getPushimiPunetoriCollection() {
        return pushimiPunetoriCollection;
    }

    public void setPushimiPunetoriCollection(Collection<PushimiPunetori> pushimiPunetoriCollection) {
        this.pushimiPunetoriCollection = pushimiPunetoriCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pushimiID != null ? pushimiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pushimi)) {
            return false;
        }
        Pushimi other = (Pushimi) object;
        if ((this.pushimiID == null && other.pushimiID != null) || (this.pushimiID != null && !this.pushimiID.equals(other.pushimiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getEmriPushimit();
    }
    
}

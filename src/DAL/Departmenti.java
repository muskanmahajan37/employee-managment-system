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
@Table(name = "Departmenti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departmenti.findAll", query = "SELECT d FROM Departmenti d")
    , @NamedQuery(name = "Departmenti.findByDepartmentiID", query = "SELECT d FROM Departmenti d WHERE d.departmentiID = :departmentiID")
    , @NamedQuery(name = "Departmenti.findByEmriDepartmentit", query = "SELECT d FROM Departmenti d WHERE d.emriDepartmentit = :emriDepartmentit")})
public class Departmenti implements Serializable {

    @OneToMany(mappedBy = "departmentiId")
    private Collection<TitulliPunetorit> titulliPunetorit1Collection;

    @OneToMany(mappedBy = "departmentiId")
    private Collection<TitulliPunetorit> titulliPunetoritCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "departmentiID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer departmentiID;
    @Column(name = "emri_departmentit")
    private String emriDepartmentit;
    @OneToMany(mappedBy = "departmentiId")
    private Collection<Punetori> punetoriCollection;

    public Departmenti() {
    }

    public Departmenti(Integer departmentiID) {
        this.departmentiID = departmentiID;
    }

    public Integer getDepartmentiID() {
        return departmentiID;
    }

    public void setDepartmentiID(Integer departmentiID) {
        this.departmentiID = departmentiID;
    }

    public String getEmriDepartmentit() {
        return emriDepartmentit;
    }

    public void setEmriDepartmentit(String emriDepartmentit) {
        this.emriDepartmentit = emriDepartmentit;
    }

    @XmlTransient
    public Collection<Punetori> getPunetoriCollection() {
        return punetoriCollection;
    }

    public void setPunetoriCollection(Collection<Punetori> punetoriCollection) {
        this.punetoriCollection = punetoriCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentiID != null ? departmentiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departmenti)) {
            return false;
        }
        Departmenti other = (Departmenti) object;
        if ((this.departmentiID == null && other.departmentiID != null) || (this.departmentiID != null && !this.departmentiID.equals(other.departmentiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDepartmentiID() + " " +getEmriDepartmentit();
    }

    @XmlTransient
    public Collection<TitulliPunetorit> getTitulliPunetoritCollection() {
        return titulliPunetoritCollection;
    }

    public void setTitulliPunetoritCollection(Collection<TitulliPunetorit> titulliPunetoritCollection) {
        this.titulliPunetoritCollection = titulliPunetoritCollection;
    }

 

    
}

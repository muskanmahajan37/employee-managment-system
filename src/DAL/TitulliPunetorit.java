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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Titulli_Punetorit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TitulliPunetorit.findAll", query = "SELECT t FROM TitulliPunetorit t")
    , @NamedQuery(name = "TitulliPunetorit.findByTitulliID", query = "SELECT t FROM TitulliPunetorit t WHERE t.titulliID = :titulliID")
    , @NamedQuery(name = "TitulliPunetorit.findByTitulliPershkrimi", query = "SELECT t FROM TitulliPunetorit t WHERE t.titulliPershkrimi = :titulliPershkrimi")})
public class TitulliPunetorit implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pagesa_ore")
    private Double pagesaOre;

    @JoinColumn(name = "departmenti_id", referencedColumnName = "departmentiID")
    @ManyToOne
    private Departmenti departmentiId;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TitulliID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer titulliID;
    @Column(name = "titulli_pershkrimi")
    private String titulliPershkrimi;
    @OneToMany(mappedBy = "titulli")
    private Collection<Punetori> punetoriCollection;

    public TitulliPunetorit() {
    }

    public TitulliPunetorit(Integer titulliID) {
        this.titulliID = titulliID;
    }

    public Integer getTitulliID() {
        return titulliID;
    }

    public void setTitulliID(Integer titulliID) {
        this.titulliID = titulliID;
    }

    public String getTitulliPershkrimi() {
        return titulliPershkrimi;
    }

    public void setTitulliPershkrimi(String titulliPershkrimi) {
        this.titulliPershkrimi = titulliPershkrimi;
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
        hash += (titulliID != null ? titulliID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitulliPunetorit)) {
            return false;
        }
        TitulliPunetorit other = (TitulliPunetorit) object;
        if ((this.titulliID == null && other.titulliID != null) || (this.titulliID != null && !this.titulliID.equals(other.titulliID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+this.getTitulliPershkrimi();
    }

    public Departmenti getDepartmentiId() {
        return departmentiId;
    }

    public void setDepartmentiId(Departmenti departmentiId) {
        this.departmentiId = departmentiId;
    }

    public Double getPagesaOre() {
        return pagesaOre;
    }

    public void setPagesaOre(Double pagesaOre) {
        this.pagesaOre = pagesaOre;
    }
    
}

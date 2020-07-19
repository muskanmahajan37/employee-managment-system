/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Kontrata")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kontrata.findAll", query = "SELECT k FROM Kontrata k")
    , @NamedQuery(name = "Kontrata.findByKontrataID", query = "SELECT k FROM Kontrata k WHERE k.kontrataID = :kontrataID")
    , @NamedQuery(name = "Kontrata.findByPagesaPerOre", query = "SELECT k FROM Kontrata k WHERE k.pagesaPerOre = :pagesaPerOre")
    , @NamedQuery(name = "Kontrata.findByKontributiPersonal", query = "SELECT k FROM Kontrata k WHERE k.kontributiPersonal = :kontributiPersonal")
    , @NamedQuery(name = "Kontrata.findByDataFillimit", query = "SELECT k FROM Kontrata k WHERE k.dataFillimit = :dataFillimit")
    , @NamedQuery(name = "Kontrata.findByDataMbarimit", query = "SELECT k FROM Kontrata k WHERE k.dataMbarimit = :dataMbarimit")})
public class Kontrata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "KontrataID")
     @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer kontrataID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pagesa_per_ore")
    private Double pagesaPerOre;
    @Column(name = "kontributi_personal")
    private Integer kontributiPersonal;
    @Column(name = "data_fillimit")
    @Temporal(TemporalType.DATE)
    private Date dataFillimit;
    @Column(name = "data_mbarimit")
    @Temporal(TemporalType.DATE)
    private Date dataMbarimit;
    @JoinColumn(name = "punetori_id", referencedColumnName = "punetoriID")
    @ManyToOne
    private Punetori punetoriId;

    public Kontrata() {
    }

    public Kontrata(Integer kontrataID) {
        this.kontrataID = kontrataID;
    }

    public Integer getKontrataID() {
        return kontrataID;
    }

    public void setKontrataID(Integer kontrataID) {
        this.kontrataID = kontrataID;
    }

    public Double getPagesaPerOre() {
        return pagesaPerOre;
    }

    public void setPagesaPerOre(Double pagesaPerOre) {
        this.pagesaPerOre = pagesaPerOre;
    }

    public Integer getKontributiPersonal() {
        return kontributiPersonal;
    }

    public void setKontributiPersonal(Integer kontributiPersonal) {
        this.kontributiPersonal = kontributiPersonal;
    }

    public Date getDataFillimit() {
        return dataFillimit;
    }

    public void setDataFillimit(Date dataFillimit) {
        this.dataFillimit = dataFillimit;
    }

    public Date getDataMbarimit() {
        return dataMbarimit;
    }

    public void setDataMbarimit(Date dataMbarimit) {
        this.dataMbarimit = dataMbarimit;
    }

    public Punetori getPunetoriId() {
        return punetoriId;
    }

    public void setPunetoriId(Punetori punetoriId) {
        this.punetoriId = punetoriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kontrataID != null ? kontrataID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kontrata)) {
            return false;
        }
        Kontrata other = (Kontrata) object;
        if ((this.kontrataID == null && other.kontrataID != null) || (this.kontrataID != null && !this.kontrataID.equals(other.kontrataID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Kontrata[ kontrataID=" + kontrataID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Vijueshmeria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vijueshmeria.findAll", query = "SELECT v FROM Vijueshmeria v")
    , @NamedQuery(name = "Vijueshmeria.findByVijueshmeriaID", query = "SELECT v FROM Vijueshmeria v WHERE v.vijueshmeriaID = :vijueshmeriaID")
    , @NamedQuery(name = "Vijueshmeria.findByData", query = "SELECT v FROM Vijueshmeria v WHERE v.data = :data")
    , @NamedQuery(name = "Vijueshmeria.findByKohaFillimit", query = "SELECT v FROM Vijueshmeria v WHERE v.kohaFillimit = :kohaFillimit")
    , @NamedQuery(name = "Vijueshmeria.findByKohaMbarimit", query = "SELECT v FROM Vijueshmeria v WHERE v.kohaMbarimit = :kohaMbarimit")
    , @NamedQuery(name = "Vijueshmeria.findByTotal", query = "SELECT v FROM Vijueshmeria v WHERE v.total = :total")
    , @NamedQuery(name = "Vijueshmeria.findByJashtOrarit", query = "SELECT v FROM Vijueshmeria v WHERE v.jashtOrarit = :jashtOrarit")})
public class Vijueshmeria implements Serializable {

   

    @Column(name = "festa")
    private Double festa;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "vijueshmeriaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer vijueshmeriaID;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "koha_fillimit")
    private String kohaFillimit;
    @Column(name = "koha_mbarimit")
    private String kohaMbarimit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private Double total;
    @Column(name = "jasht_orarit")
    private Double jashtOrarit;
    @JoinColumn(name = "punetori_id", referencedColumnName = "punetoriID")//amo ni her ma run
    @ManyToOne
    private Punetori punetoriId;

    public Vijueshmeria() {
    }

    public Vijueshmeria(Integer vijueshmeriaID) {
        this.vijueshmeriaID = vijueshmeriaID;
    }

    public Integer getVijueshmeriaID() {
        return vijueshmeriaID;
    }

    public void setVijueshmeriaID(Integer vijueshmeriaID) {
        this.vijueshmeriaID = vijueshmeriaID;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getKohaFillimit() {
        return kohaFillimit;
    }

    public void setKohaFillimit(String kohaFillimit) {
        this.kohaFillimit = kohaFillimit;
    }

    public String getKohaMbarimit() {
        return kohaMbarimit;
    }

    public void setKohaMbarimit(String kohaMbarimit) {
        this.kohaMbarimit = kohaMbarimit;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getJashtOrarit() {
        return jashtOrarit;
    }

    public void setJashtOrarit(Double jashtOrarit) {
        this.jashtOrarit = jashtOrarit;
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
        hash += (vijueshmeriaID != null ? vijueshmeriaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vijueshmeria)) {
            return false;
        }
        Vijueshmeria other = (Vijueshmeria) object;
        if ((this.vijueshmeriaID == null && other.vijueshmeriaID != null) || (this.vijueshmeriaID != null && !this.vijueshmeriaID.equals(other.vijueshmeriaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Vijueshmeria[ vijueshmeriaID=" + vijueshmeriaID + " ]";
    }

    public Double getFesta() {
        return festa;
    }

    public void setFesta(Double festa) {
        this.festa = festa;
    }


    
}

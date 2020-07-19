/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Zbritja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zbritja.findAll", query = "SELECT z FROM Zbritja z")
    , @NamedQuery(name = "Zbritja.findByZbritjaID", query = "SELECT z FROM Zbritja z WHERE z.zbritjaID = :zbritjaID")
    , @NamedQuery(name = "Zbritja.findByBruto", query = "SELECT z FROM Zbritja z WHERE z.bruto = :bruto")
    , @NamedQuery(name = "Zbritja.findByKontributiPersonal", query = "SELECT z FROM Zbritja z WHERE z.kontributiPersonal = :kontributiPersonal")
    , @NamedQuery(name = "Zbritja.findByZbritjaTatimore", query = "SELECT z FROM Zbritja z WHERE z.zbritjaTatimore = :zbritjaTatimore")})
public class Zbritja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ZbritjaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer zbritjaID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "bruto")
    private Double bruto;
    @Column(name = "kontributi_personal")
    private Double kontributiPersonal;
    @Column(name = "zbritja_tatimore")
    private Double zbritjaTatimore;
    @JoinColumn(name = "PagesaID", referencedColumnName = "PagesaID")
    @OneToOne
    private Pagesa pagesaID;

    public Zbritja() {
    }

    public Zbritja(Integer zbritjaID) {
        this.zbritjaID = zbritjaID;
    }

    public Integer getZbritjaID() {
        return zbritjaID;
    }

    public void setZbritjaID(Integer zbritjaID) {
        this.zbritjaID = zbritjaID;
    }

    public Double getBruto() {
        return bruto;
    }

    public void setBruto(Double bruto) {
        this.bruto = bruto;
    }

    public Double getKontributiPersonal() {
        return kontributiPersonal;
    }

    public void setKontributiPersonal(Double kontributiPersonal) {
        this.kontributiPersonal = kontributiPersonal;
    }

    public Double getZbritjaTatimore() {
        return zbritjaTatimore;
    }

    public void setZbritjaTatimore(Double zbritjaTatimore) {
        this.zbritjaTatimore = zbritjaTatimore;
    }

    public Pagesa getPagesaID() {
        return pagesaID;
    }

    public void setPagesaID(Pagesa pagesaID) {
        this.pagesaID = pagesaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zbritjaID != null ? zbritjaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zbritja)) {
            return false;
        }
        Zbritja other = (Zbritja) object;
        if ((this.zbritjaID == null && other.zbritjaID != null) || (this.zbritjaID != null && !this.zbritjaID.equals(other.zbritjaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Zbritja[ zbritjaID=" + zbritjaID + " ]";
    }
    
}

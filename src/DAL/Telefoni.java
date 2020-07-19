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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Telefoni")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefoni.findAll", query = "SELECT t FROM Telefoni t")
    , @NamedQuery(name = "Telefoni.findByTelefoniID", query = "SELECT t FROM Telefoni t WHERE t.telefoniID = :telefoniID")
    , @NamedQuery(name = "Telefoni.findByTelefoniShtepise", query = "SELECT t FROM Telefoni t WHERE t.telefoniShtepise = :telefoniShtepise")
    , @NamedQuery(name = "Telefoni.findByTelefoniBiznesit", query = "SELECT t FROM Telefoni t WHERE t.telefoniBiznesit = :telefoniBiznesit")
    , @NamedQuery(name = "Telefoni.findByTelefoniMobil", query = "SELECT t FROM Telefoni t WHERE t.telefoniMobil = :telefoniMobil")})
public class Telefoni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "telefoniID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer telefoniID;
    @Column(name = "telefoni_shtepise")
    private String telefoniShtepise;
    @Column(name = "telefoni_biznesit")
    private String telefoniBiznesit;
    @Column(name = "telefoni_mobil")
    private String telefoniMobil;
    @JoinColumn(name = "punetori_id", referencedColumnName = "punetoriID")
    @ManyToOne
    private Punetori punetoriId;

    public Telefoni() {
    }

    public Telefoni(Integer telefoniID) {
        this.telefoniID = telefoniID;
    }

    public Integer getTelefoniID() {
        return telefoniID;
    }

    public void setTelefoniID(Integer telefoniID) {
        this.telefoniID = telefoniID;
    }

    public String getTelefoniShtepise() {
        return telefoniShtepise;
    }

    public void setTelefoniShtepise(String telefoniShtepise) {
        this.telefoniShtepise = telefoniShtepise;
    }

    public String getTelefoniBiznesit() {
        return telefoniBiznesit;
    }

    public void setTelefoniBiznesit(String telefoniBiznesit) {
        this.telefoniBiznesit = telefoniBiznesit;
    }

    public String getTelefoniMobil() {
        return telefoniMobil;
    }

    public void setTelefoniMobil(String telefoniMobil) {
        this.telefoniMobil = telefoniMobil;
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
        hash += (telefoniID != null ? telefoniID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefoni)) {
            return false;
        }
        Telefoni other = (Telefoni) object;
        if ((this.telefoniID == null && other.telefoniID != null) || (this.telefoniID != null && !this.telefoniID.equals(other.telefoniID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "";
    }

}

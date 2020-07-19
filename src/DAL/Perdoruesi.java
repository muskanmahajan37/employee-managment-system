/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Perdoruesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perdoruesi.findAll", query = "SELECT p FROM Perdoruesi p"),
    @NamedQuery(name ="Perdoruesi.findExceptAdmin",query="select p from Perdoruesi p where p.roliID.roliID=2")
    , @NamedQuery(name = "Perdoruesi.findByPerdoruesiID", query = "SELECT p FROM Perdoruesi p WHERE p.perdoruesiID = :perdoruesiID")
    , @NamedQuery(name = "Perdoruesi.findByUsername", query = "SELECT p FROM Perdoruesi p WHERE p.username = :username")
    , @NamedQuery(name = "Perdoruesi.findByPassword", query = "SELECT p FROM Perdoruesi p WHERE p.password = :password")})
public class Perdoruesi implements Serializable {

    @OneToMany(mappedBy = "perdoruesiID")
    private Collection<PushimiPunetori> pushimiPunetoriCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PerdoruesiID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer perdoruesiID;
    @Column(name = "Username")
    private String username;
    @Column(name = "Password")
    private String password;
    @OneToMany(mappedBy = "perdoruesiId")
    private Collection<Pagesa> pagesaCollection;
    @JoinColumn(name = "punetoriID", referencedColumnName = "punetoriID")
     @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Punetori punetoriID;
    @JoinColumn(name = "RoliID", referencedColumnName = "RoliID")
    @ManyToOne
    private Roli roliID;

    public Perdoruesi() {
    }

    public Perdoruesi(Integer perdoruesiID) {
        this.perdoruesiID = perdoruesiID;
    }

    public Integer getPerdoruesiID() {
        return perdoruesiID;
    }

    public void setPerdoruesiID(Integer perdoruesiID) {
        this.perdoruesiID = perdoruesiID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Pagesa> getPagesaCollection() {
        return pagesaCollection;
    }

    public void setPagesaCollection(Collection<Pagesa> pagesaCollection) {
        this.pagesaCollection = pagesaCollection;
    }

    public Punetori getPunetoriID() {
        return punetoriID;
    }

    public void setPunetoriID(Punetori punetoriID) {
        this.punetoriID = punetoriID;
    }

    public Roli getRoliID() {
        return roliID;
    }

    public void setRoliID(Roli roliID) {
        this.roliID = roliID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perdoruesiID != null ? perdoruesiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perdoruesi)) {
            return false;
        }
        Perdoruesi other = (Perdoruesi) object;
        if ((this.perdoruesiID == null && other.perdoruesiID != null) || (this.perdoruesiID != null && !this.perdoruesiID.equals(other.perdoruesiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getPunetoriID().getEmri() + " " +this.getPunetoriID().getMbiemri();
    }

    @XmlTransient
    public Collection<PushimiPunetori> getPushimiPunetoriCollection() {
        return pushimiPunetoriCollection;
    }

    public void setPushimiPunetoriCollection(Collection<PushimiPunetori> pushimiPunetoriCollection) {
        this.pushimiPunetoriCollection = pushimiPunetoriCollection;
    }
    
}

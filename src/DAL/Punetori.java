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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MR-ROBOT
 */
@Entity
@Table(name = "Punetori")
@XmlRootElement

@NamedQueries({
    @NamedQuery(name = "Punetori.findAll", query = "SELECT DISTINCT p FROM Punetori p")
    , @NamedQuery(name = "Punetori.findByPunetoriID", query = "SELECT p FROM Punetori p WHERE p.punetoriID = :punetoriID")
    , @NamedQuery(name = "Punetori.findByEmri", query = "SELECT p FROM Punetori p WHERE p.emri = :emri")
    , @NamedQuery(name = "Punetori.findByMbiemri", query = "SELECT p FROM Punetori p WHERE p.mbiemri = :mbiemri")
    , @NamedQuery(name = "Punetori.findByGjinia", query = "SELECT p FROM Punetori p WHERE p.gjinia = :gjinia")
    , @NamedQuery(name = "Punetori.findByQyteti", query = "SELECT p FROM Punetori p WHERE p.qyteti = :qyteti")
    , @NamedQuery(name = "Punetori.findByAdresa", query = "SELECT p FROM Punetori p WHERE p.adresa = :adresa")
    , @NamedQuery(name = "Punetori.findByDataLindjes", query = "SELECT p FROM Punetori p WHERE p.dataLindjes = :dataLindjes")
    , @NamedQuery(name = "Punetori.findByEmail", query = "SELECT p FROM Punetori p WHERE p.email = :email")

    , @NamedQuery(name = "Punetori.findOnlyEmployees", query = "SELECT \n"
            + "\n"
            + "DISTINCT p from Punetori p INNER Join Perdoruesi pr INNER JOIN Roli r where p.punetoriID=pr.punetoriID.punetoriID and pr.roliID.roliID = r.roliID and r.roliID=2")
    , @NamedQuery(name = "Punetori.findByDataPunesimit", query = " SELECT p FROM Punetori p WHERE p.dataPunesimit = :dataPunesimit")})
public class Punetori implements Serializable {

    @OneToMany(mappedBy = "punetoriId")
    private Collection<Kontrata> kontrataCollection;

    @JoinColumn(name = "titulli", referencedColumnName = "TitulliID")
    @ManyToOne
    private TitulliPunetorit titulli;

    @OneToMany(mappedBy = "punetoriId")
    private Collection<Vijueshmeria> vijueshmeriaCollection;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "punetoriID")
    private Perdoruesi perdoruesi;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "punetoriID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer punetoriID;
    @Column(name = "emri")
    private String emri;
    @Column(name = "mbiemri")
    private String mbiemri;
    @Column(name = "gjinia")
    private String gjinia;
    @Column(name = "qyteti")
    private String qyteti;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "data_lindjes")
    @Temporal(TemporalType.DATE)
    private Date dataLindjes;
    @Column(name = "email")
    private String email;
    @Column(name = "data_punesimit")
    @Temporal(TemporalType.DATE)
    private Date dataPunesimit;
    @OneToMany(mappedBy = "punetoriId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)//qito e kom shtu un fetch = FetchType.Eager
    private Collection<Telefoni> telefoniCollection;
    @JoinColumn(name = "departmenti_id", referencedColumnName = "departmentiID")
    @ManyToOne
    private Departmenti departmentiId;

    public Punetori() {
    }

    public Punetori(Integer punetoriID) {
        this.punetoriID = punetoriID;
    }

    public Integer getPunetoriID() {
        return punetoriID;
    }

    public void setPunetoriID(Integer punetoriID) {
        this.punetoriID = punetoriID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getGjinia() {
        return gjinia;
    }

    public void setGjinia(String gjinia) {
        this.gjinia = gjinia;
    }

    public String getQyteti() {
        return qyteti;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Date getDataLindjes() {
        return dataLindjes;
    }

    public void setDataLindjes(Date dataLindjes) {
        this.dataLindjes = dataLindjes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataPunesimit() {
        return dataPunesimit;
    }

    public void setDataPunesimit(Date dataPunesimit) {
        this.dataPunesimit = dataPunesimit;
    }

    @XmlTransient
    public Collection<Telefoni> getTelefoniCollection() {
        return telefoniCollection;
    }

    public void setTelefoniCollection(Collection<Telefoni> telefoniCollection) {
        this.telefoniCollection = telefoniCollection;
    }

    public Departmenti getDepartmentiId() {
        return departmentiId;
    }

    public void setDepartmentiId(Departmenti departmentiId) {
        this.departmentiId = departmentiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (punetoriID != null ? punetoriID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Punetori)) {
            return false;
        }
        Punetori other = (Punetori) object;
        if ((this.punetoriID == null && other.punetoriID != null) || (this.punetoriID != null && !this.punetoriID.equals(other.punetoriID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri + " " + mbiemri + " ID:" + punetoriID;
    }

    public Perdoruesi getPerdoruesi() {
        return perdoruesi;
    }

    public void setPerdoruesi(Perdoruesi perdoruesi) {
        this.perdoruesi = perdoruesi;
    }

    @XmlTransient
    public Collection<Vijueshmeria> getVijueshmeriaCollection() {
        return vijueshmeriaCollection;
    }

    public void setVijueshmeriaCollection(Collection<Vijueshmeria> vijueshmeriaCollection) {
        this.vijueshmeriaCollection = vijueshmeriaCollection;
    }

    public TitulliPunetorit getTitulli() {
        return titulli;
    }

    public void setTitulli(TitulliPunetorit titulli) {
        this.titulli = titulli;
    }

    @XmlTransient
    public Collection<Kontrata> getKontrataCollection() {
        return kontrataCollection;
    }

    public void setKontrataCollection(Collection<Kontrata> kontrataCollection) {
        this.kontrataCollection = kontrataCollection;
    }

}

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
@Table(name = "Pushimi_Punetori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PushimiPunetori.findAll", query = "SELECT p FROM PushimiPunetori p")
    , @NamedQuery(name = "PushimiPunetori.findByPushimipunetoriID", query = "SELECT p FROM PushimiPunetori p WHERE p.pushimipunetoriID = :pushimipunetoriID")
    , @NamedQuery(name = "PushimiPunetori.findByDataFillimit", query = "SELECT p FROM PushimiPunetori p WHERE p.dataFillimit = :dataFillimit")
    , @NamedQuery(name = "PushimiPunetori.findByDataMbarimit", query = "SELECT p FROM PushimiPunetori p WHERE p.dataMbarimit = :dataMbarimit")
    , @NamedQuery(name = "PushimiPunetori.findByTotali", query = "SELECT p FROM PushimiPunetori p WHERE p.totali = :totali")
    , @NamedQuery(name = "PushimiPunetori.findByKerkuara", query = "SELECT p FROM PushimiPunetori p WHERE p.kerkuara = :kerkuara")
    , @NamedQuery(name = "PushimiPunetori.findByMbetura", query = "SELECT p FROM PushimiPunetori p WHERE p.mbetura = :mbetura")})
public class PushimiPunetori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pushimi_punetoriID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer pushimipunetoriID;
    @Column(name = "dataFillimit")
    @Temporal(TemporalType.DATE)
    private Date dataFillimit;
    @Column(name = "dataMbarimit")
    @Temporal(TemporalType.DATE)
    private Date dataMbarimit;
    @Column(name = "totali")
    private Integer totali;
    @Column(name = "kerkuara")
    private Integer kerkuara;
    @Column(name = "mbetura")
    private Integer mbetura;
    @JoinColumn(name = "perdoruesiID", referencedColumnName = "PerdoruesiID")
    @ManyToOne
    private Perdoruesi perdoruesiID;
    @JoinColumn(name = "pushimiID", referencedColumnName = "pushimiID")
    @ManyToOne
    private Pushimi pushimiID;

    public PushimiPunetori() {
    }

    public PushimiPunetori(Integer pushimipunetoriID) {
        this.pushimipunetoriID = pushimipunetoriID;
    }

    public Integer getPushimipunetoriID() {
        return pushimipunetoriID;
    }

    public void setPushimipunetoriID(Integer pushimipunetoriID) {
        this.pushimipunetoriID = pushimipunetoriID;
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

    public Integer getTotali() {
        return totali;
    }

    public void setTotali(Integer totali) {
        this.totali = totali;
    }

    public Integer getKerkuara() {
        return kerkuara;
    }

    public void setKerkuara(Integer kerkuara) {
        this.kerkuara = kerkuara;
    }

    public Integer getMbetura() {
        return mbetura;
    }

    public void setMbetura(Integer mbetura) {
        this.mbetura = mbetura;
    }

    public Perdoruesi getPerdoruesiID() {
        return perdoruesiID;
    }

    public void setPerdoruesiID(Perdoruesi perdoruesiID) {
        this.perdoruesiID = perdoruesiID;
    }

    public Pushimi getPushimiID() {
        return pushimiID;
    }

    public void setPushimiID(Pushimi pushimiID) {
        this.pushimiID = pushimiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pushimipunetoriID != null ? pushimipunetoriID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PushimiPunetori)) {
            return false;
        }
        PushimiPunetori other = (PushimiPunetori) object;
        if ((this.pushimipunetoriID == null && other.pushimipunetoriID != null) || (this.pushimipunetoriID != null && !this.pushimipunetoriID.equals(other.pushimipunetoriID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test";
    }
    
}

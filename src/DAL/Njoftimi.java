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
import javax.persistence.Lob;
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
@Table(name = "Njoftimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Njoftimi.findAll", query = "SELECT n FROM Njoftimi n")
    , @NamedQuery(name = "Njoftimi.findByNjoftimiID", query = "SELECT n FROM Njoftimi n WHERE n.njoftimiID = :njoftimiID")
    , @NamedQuery(name = "Njoftimi.findByData", query = "SELECT n FROM Njoftimi n WHERE n.data = :data")})
public class Njoftimi implements Serializable {

    @Column(name = "data_dergeses")
    @Temporal(TemporalType.DATE)
    private Date dataDergeses;

    @Column(name = "titulli")
    private String titulli;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NjoftimiID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer njoftimiID;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Lob
    @Column(name = "mesazhi")
    private String mesazhi;
    @JoinColumn(name = "lloji_id", referencedColumnName = "LlojiID")
    @ManyToOne
    private NjoftimiLloji llojiId;
    @JoinColumn(name = "perdoruesi_id", referencedColumnName = "PerdoruesiID")
    @ManyToOne
    private Perdoruesi perdoruesiId;

    public Njoftimi() {
    }

    public Njoftimi(Integer njoftimiID) {
        this.njoftimiID = njoftimiID;
    }

    public Integer getNjoftimiID() {
        return njoftimiID;
    }

    public void setNjoftimiID(Integer njoftimiID) {
        this.njoftimiID = njoftimiID;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMesazhi() {
        return mesazhi;
    }

    public void setMesazhi(String mesazhi) {
        this.mesazhi = mesazhi;
    }

    public NjoftimiLloji getLlojiId() {
        return llojiId;
    }

    public void setLlojiId(NjoftimiLloji llojiId) {
        this.llojiId = llojiId;
    }

    public Perdoruesi getPerdoruesiId() {
        return perdoruesiId;
    }

    public void setPerdoruesiId(Perdoruesi perdoruesiId) {
        this.perdoruesiId = perdoruesiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (njoftimiID != null ? njoftimiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Njoftimi)) {
            return false;
        }
        Njoftimi other = (Njoftimi) object;
        if ((this.njoftimiID == null && other.njoftimiID != null) || (this.njoftimiID != null && !this.njoftimiID.equals(other.njoftimiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Njoftimi[ njoftimiID=" + njoftimiID + " ]";
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public Date getDataDergeses() {
        return dataDergeses;
    }

    public void setDataDergeses(Date dataDergeses) {
        this.dataDergeses = dataDergeses;
    }
    
}

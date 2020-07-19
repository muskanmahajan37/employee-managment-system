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
@Table(name = "Verejtja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Verejtja.findAll", query = "SELECT v FROM Verejtja v")
    , @NamedQuery(name = "Verejtja.findByVerejtjaID", query = "SELECT v FROM Verejtja v WHERE v.verejtjaID = :verejtjaID")
    , @NamedQuery(name = "Verejtja.findByEmriPunetorit", query = "SELECT v FROM Verejtja v WHERE v.emriPunetorit = :emriPunetorit")
    , @NamedQuery(name = "Verejtja.findByMbiemriPunetorit", query = "SELECT v FROM Verejtja v WHERE v.mbiemriPunetorit = :mbiemriPunetorit")
    , @NamedQuery(name = "Verejtja.findByTitulliRastit", query = "SELECT v FROM Verejtja v WHERE v.titulliRastit = :titulliRastit")
    , @NamedQuery(name = "Verejtja.findByData", query = "SELECT v FROM Verejtja v WHERE v.data = :data")
    , @NamedQuery(name = "Verejtja.findByKrijuarNga", query = "SELECT v FROM Verejtja v WHERE v.krijuarNga = :krijuarNga")})
public class Verejtja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VerejtjaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer verejtjaID;
    @Column(name = "emri_punetorit")
    private String emriPunetorit;
    @Column(name = "mbiemri_punetorit")
    private String mbiemriPunetorit;
    @Column(name = "titulli_rastit")
    private String titulliRastit;
    @Lob
    @Column(name = "pershkrimi")
    private String pershkrimi;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "krijuar_nga")
    private String krijuarNga;
    @JoinColumn(name = "perdoruesi_id", referencedColumnName = "PerdoruesiID")
    @ManyToOne
    private Perdoruesi perdoruesiId;

    public Verejtja() {
    }

    public Verejtja(Integer verejtjaID) {
        this.verejtjaID = verejtjaID;
    }

    public Integer getVerejtjaID() {
        return verejtjaID;
    }

    public void setVerejtjaID(Integer verejtjaID) {
        this.verejtjaID = verejtjaID;
    }

    public String getEmriPunetorit() {
        return emriPunetorit;
    }

    public void setEmriPunetorit(String emriPunetorit) {
        this.emriPunetorit = emriPunetorit;
    }

    public String getMbiemriPunetorit() {
        return mbiemriPunetorit;
    }

    public void setMbiemriPunetorit(String mbiemriPunetorit) {
        this.mbiemriPunetorit = mbiemriPunetorit;
    }

    public String getTitulliRastit() {
        return titulliRastit;
    }

    public void setTitulliRastit(String titulliRastit) {
        this.titulliRastit = titulliRastit;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getKrijuarNga() {
        return krijuarNga;
    }

    public void setKrijuarNga(String krijuarNga) {
        this.krijuarNga = krijuarNga;
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
        hash += (verejtjaID != null ? verejtjaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Verejtja)) {
            return false;
        }
        Verejtja other = (Verejtja) object;
        if ((this.verejtjaID == null && other.verejtjaID != null) || (this.verejtjaID != null && !this.verejtjaID.equals(other.verejtjaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Verejtja[ verejtjaID=" + verejtjaID + " ]";
    }
    
}

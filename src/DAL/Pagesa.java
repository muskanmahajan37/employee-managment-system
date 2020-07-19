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
import javax.persistence.OneToOne;
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
@Table(name = "Pagesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagesa.findAll", query = "SELECT p FROM Pagesa p")
    , @NamedQuery(name = "Pagesa.findByPagesaID", query = "SELECT p FROM Pagesa p WHERE p.pagesaID = :pagesaID")
    , @NamedQuery(name = "Pagesa.findByDataPageses", query = "SELECT p FROM Pagesa p WHERE p.dataPageses = :dataPageses")
    , @NamedQuery(name = "Pagesa.findByTotaliBruto", query = "SELECT p FROM Pagesa p WHERE p.totaliBruto = :totaliBruto")
    , @NamedQuery(name = "Pagesa.findByTotaliNeto", query = "SELECT p FROM Pagesa p WHERE p.totaliNeto = :totaliNeto")})
public class Pagesa implements Serializable {

    @Column(name = "muaji_pageses")
    @Temporal(TemporalType.DATE)
    private Date muajiPageses;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PagesaID")
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer pagesaID;
    @Column(name = "data_pageses")
    @Temporal(TemporalType.DATE)
    private Date dataPageses;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totali_bruto")
    private Double totaliBruto;
    @Column(name = "totali_neto")
    private Double totaliNeto;
    @JoinColumn(name = "perdoruesi_id", referencedColumnName = "PerdoruesiID")
    @ManyToOne
    private Perdoruesi perdoruesiId;
    @OneToOne(mappedBy = "pagesaID")
    private Zbritja zbritja;

    public Pagesa() {
    }

    public Pagesa(Integer pagesaID) {
        this.pagesaID = pagesaID;
    }

    public Integer getPagesaID() {
        return pagesaID;
    }

    public void setPagesaID(Integer pagesaID) {
        this.pagesaID = pagesaID;
    }

    public Date getDataPageses() {
        return dataPageses;
    }

    public void setDataPageses(Date dataPageses) {
        this.dataPageses = dataPageses;
    }

    public Double getTotaliBruto() {
        return totaliBruto;
    }

    public void setTotaliBruto(Double totaliBruto) {
        this.totaliBruto = totaliBruto;
    }

    public Double getTotaliNeto() {
        return totaliNeto;
    }

    public void setTotaliNeto(Double totaliNeto) {
        this.totaliNeto = totaliNeto;
    }

    public Perdoruesi getPerdoruesiId() {
        return perdoruesiId;
    }

    public void setPerdoruesiId(Perdoruesi perdoruesiId) {
        this.perdoruesiId = perdoruesiId;
    }

    public Zbritja getZbritja() {
        return zbritja;
    }

    public void setZbritja(Zbritja zbritja) {
        this.zbritja = zbritja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagesaID != null ? pagesaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagesa)) {
            return false;
        }
        Pagesa other = (Pagesa) object;
        if ((this.pagesaID == null && other.pagesaID != null) || (this.pagesaID != null && !this.pagesaID.equals(other.pagesaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAL.Pagesa[ pagesaID=" + pagesaID + " ]";
    }

    public Date getMuajiPageses() {
        return muajiPageses;
    }

    public void setMuajiPageses(Date muajiPageses) {
        this.muajiPageses = muajiPageses;
    }
    
}

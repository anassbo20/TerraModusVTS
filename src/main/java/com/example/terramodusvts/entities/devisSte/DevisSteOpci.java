package com.example.terramodusvts.entities.devisSte;

import com.example.terramodusvts.entities.Immob;
import com.example.terramodusvts.entities.TypeBien;
import com.example.terramodusvts.entities.TypeDevis;
import com.example.terramodusvts.entities.TypeValeurEv;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity(name = "devis-ste-opci")
public class DevisSteOpci implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 3)
    private Long id;
    @Column(name = "type-valeur-éval")
    private TypeValeurEv typeValeurEv;
    @Column(name = "type-bien")
    private TypeBien typeBien;

    @OneToMany
    private List<Immob> immobs;
    @ManyToOne
    private DemandeurSte demandeurSte;

    @Column(name = "latitude")
    private Double Lat;

    @Column(name = "longitude")
    private Double Lon;
    @Column(name = "indemnite-kilometrique")
    private Double IK;

    @Column(name = "besoin",columnDefinition = "TEXT")
    private String besoin;

    @Column(name = "created-at")
    @JsonFormat(pattern="dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date createdAt = new Date();
    @ManyToOne
    private TypeDevis typeDevis;

    private String livrables;

    private String consDocs;
    private String siege;
    public TypeValeurEv getTypeValeurEv() {
        return typeValeurEv;
    }

    public void setTypeValeurEv(TypeValeurEv typeValeurEv) {
        this.typeValeurEv = typeValeurEv;
    }

    public TypeBien getTypeBien() {
        return typeBien;
    }

    public void setTypeBien(TypeBien typeBien) {
        this.typeBien = typeBien;
    }

    public Double getLat() {
        return Lat;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public Double getLon() {
        return Lon;
    }

    public void setLon(Double lon) {
        Lon = lon;
    }

    public Double getIK() {
        return IK;
    }

    public void setIK(Double IK) {
        this.IK = IK;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DemandeurSte getDemandeurSte() {
        return demandeurSte;
    }

    public void setDemandeurSte(DemandeurSte demandeurSte) {
        this.demandeurSte = demandeurSte;
    }

    public String getBesoin() {
        return besoin;
    }

    public void setBesoin(String besoin) {
        this.besoin = besoin;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public TypeDevis getTypeDevis() {
        return typeDevis;
    }

    public void setTypeDevis(TypeDevis typeDevis) {
        this.typeDevis = typeDevis;
    }

    public List<Immob> getImmobs() {
        return immobs;
    }

    public void setImmobs(List<Immob> immobs) {
        this.immobs = immobs;
    }

    public String getLivrables() {
        return livrables;
    }

    public void setLivrables(String livrables) {
        this.livrables = livrables;
    }

    public String getConsDocs() {
        return consDocs;
    }

    public void setConsDocs(String consDocs) {
        this.consDocs = consDocs;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }
}

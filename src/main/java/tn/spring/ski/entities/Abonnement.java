package tn.spring.ski.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon; // Clé primaire
    private Float prixAbon;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon ;

    public Long getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(Long numAbon) {
        this.numAbon = numAbon;
    }

    public Float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(Float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public TypeAbonnement getTypeAbon() {
        return typeAbon;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.typeAbon = typeAbon;
    }
}

package tn.spring.ski.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data

public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur; // Clé primaire
    private String nomM;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date dateRecru;


    public Long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(Long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public Date getDateRecru() {
        return dateRecru;
    }

    public void setDateRecru(Date dateRecru) {
        this.dateRecru = dateRecru;
    }
}

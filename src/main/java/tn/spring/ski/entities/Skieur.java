package tn.spring.ski.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumSkieur; // Clé primaire
    private String NomS;
    private String PreNomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String Ville;


    public Long getNumSkieur() {
        return NumSkieur;
    }

    public void setNumSkieur(Long numSkieur) {
        NumSkieur = numSkieur;
    }

    public String getNomS() {
        return NomS;
    }

    public void setNomS(String nomS) {
        NomS = nomS;
    }

    public String getPreNomS() {
        return PreNomS;
    }

    public void setPreNomS(String preNomS) {
        PreNomS = preNomS;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }
}

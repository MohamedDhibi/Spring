package tn.spring.ski.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Piste {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long NumPiste; // Clé primaire
    private String NomPiste;
    private int longeur;
    private int pente;
    @Enumerated(EnumType.STRING)
    private Couleur couleur ;

    public Long getNumPiste() {
        return NumPiste;
    }

    public void setNumPiste(Long numPiste) {
        NumPiste = numPiste;
    }

    public String getNomPiste() {
        return NomPiste;
    }

    public void setNomPiste(String nomPiste) {
        NomPiste = nomPiste;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
}

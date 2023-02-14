package tn.spring.ski.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data

public class Insription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long NumInscription; // Clé primaire
    private int numSemaine;

    public Long getNumInscription() {
        return NumInscription;
    }
    public void setNumInscription(Long NumInscription) {
        this.NumInscription= NumInscription;
    }
    public int getnumSemaine() {
        return numSemaine;
    }
    public void setnumSemaine(int numSemaine) {
        this.numSemaine= numSemaine;
    }
}

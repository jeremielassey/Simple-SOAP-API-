package metier;

import java.util.Date;

public class Compte {

    int code;
    double montant;
    Date date;

    public Compte(int c,double m,Date d){
        this.code = c;
        this.montant = m;
        this.date = d;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


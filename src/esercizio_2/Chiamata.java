package esercizio_2;

public class Chiamata {
    private String numeroChiamato;
    private double durata;

    public Chiamata(String numeroChiamato, double durata){
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }
    //Getter per prendere la chiamata
    public String getNumeroChiamato(){
        return numeroChiamato;
    }

    public double getDurata() {
        return durata;
    }

    @Override
    public String toString(){
        return "Il numero chiamato: " + numeroChiamato + " con la durata di " + durata + " minuti";
    }
}


package esercizio_2;

public class Chiamata {
    private String numeroChiamato;
    private int durata;

    public Chiamata(String numeroChiamato, int durata){
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }
    //Getter per prendere la chiamata
    public String getNumeroChiamato(){
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString(){
        return "Il numero chiamato: " + numeroChiamato + " con la durata di " + durata + " minuti";
    }
}


package esercizio_3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    public static int nrPezzi = 1500;

    //Costruttore
    public Articolo(int codiceArticolo, String descrizione, double prezzo){
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.codiceArticolo = codiceArticolo;
        nrPezzi --;

    }
    //leggo l'articolo

    public int getCodiceArticolo(){
        return codiceArticolo;
    }
    public String getDescrizione(){
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    //Stampo l'articolo
    @Override
    public String toString(){
        return "Articolo: " + descrizione + " con il codice: "+ codiceArticolo+ ". Prezzo: "+ prezzo + " euro." + "Disponibile "+ nrPezzi + " per l'aquisto.";
    }

}

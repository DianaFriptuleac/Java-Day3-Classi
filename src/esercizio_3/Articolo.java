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
}

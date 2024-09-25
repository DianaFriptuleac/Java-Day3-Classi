package esercizio_3;

import java.util.ArrayList;

public class Carrello {
    private String clienteAssociato;
    private ArrayList<Articolo> articoli;
    private double totaleCosto;

    //Costruttore

    public Carrello(String clienteAssociato, ArrayList articoli, double totaleCosto){
        this.clienteAssociato= clienteAssociato;
        this.articoli = new ArrayList<>(); //inizzializzo con un array vuoto
        this.totaleCosto = 0.0; //inizializzo a zero
    }

}

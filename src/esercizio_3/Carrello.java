package esercizio_3;

import java.util.ArrayList;

public class Carrello {
    private String clienteAssociato;
    private ArrayList<Articolo> articoli;
    private double totaleCosto;

    //Costruttore

    public Carrello(String clienteAssociato){
        this.clienteAssociato= clienteAssociato;
        this.articoli = new ArrayList<>(); //inizzializzo con un array vuoto
        this.totaleCosto = 0.0; //inizializzo a zero
    }

    //Metodo per aggiungere articolo al carello
    public void addArticolo(Articolo newarticolo){
        articoli.add(newarticolo);
        totaleCosto += newarticolo.getPrezzo();
    }

    //Metodo per stampare il carello
    public void dettagliCarello(){
        System.out.println("Cliente" + clienteAssociato);
        System.out.println("Articoli nel carello: ");
        for(Articolo art : articoli){
            System.out.println(art);
        }

        System.out.println("Totale: " + totaleCosto + " euro");
    }

}

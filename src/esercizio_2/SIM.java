package esercizio_2;

import java.util.ArrayList;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private ArrayList<Chiamata> ultimeChiamate;

    //il costruttore per la SIM
    public SIM(String numeroTelefono){
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new ArrayList<>();
    }

    //getter e setter
    public String getNumeroTelefono(){
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }
    //Metodo per aggiungere la chiamata
    public void addChiamate (String numeroChiamato, double durata){
        if (durata > 0 && numeroChiamato !=null) {
            Chiamata chiamata = new Chiamata(numeroChiamato, durata);

            if(ultimeChiamate.size() == 5){
                ultimeChiamate.removeFirst(); //cancella chiamata
            }
            ultimeChiamate.add(chiamata);  //aggiungi chiamata
            System.out.println("Il numero da lei chiamato è " + numeroChiamato + "per una durata di " + durata + " minuti.");
        } else{
            System.out.println("Dati della chiamata errati!");
        }
    }

//Mmetodo pe stampare i dati della SIM
    public void stampaDatiSIM(){
        System.out.println("Numero di telefono "+ numeroTelefono);
        System.out.println("Credito " + credito + " euro");

        if(ultimeChiamate.isEmpty()){
            System.out.println("Non ci sono chiamate effettuate.");
        } else{
            System.out.println("La lista delle ultime chiamate: ");
            for (Chiamata chiamata : ultimeChiamate){
            System.out.println(chiamata);
            }
        }
    }
}

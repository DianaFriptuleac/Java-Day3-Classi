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
    public void addChiamate (String numeroChiamato, int durata){
        if (durata > 0 && numeroChiamato !=null) {
            Chiamata chiamata = new Chiamata(numeroChiamato, durata);

            if(ultimeChiamate.size() == 5){
                ultimeChiamate.remove(chiamata); //cancella chiamata
            }
            ultimeChiamate.addLast(chiamata);  //aggiungi chiamata
            System.out.println("Il numero da lei chiamato è " + numeroChiamato + "per una durata di " + durata + " minuti.");
        } else{
            System.out.println("Dati della chiamata errati!");
        }
    }


}

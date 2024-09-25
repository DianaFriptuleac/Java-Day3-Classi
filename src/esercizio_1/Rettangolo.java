package esercizio_1;

public class Rettangolo {
    //Attributi rettangolo
    private double altezza;
    private double larghezza;

    //Costruttore
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }
    // Get e set x accedere

    //prendo l'altezza
    public double getAltezza() {
        return altezza;
    }

    //scrivo l'altezza
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    //leggo la larghezza
    public double getLarghezza() {
        return larghezza;
    }
    //scrivo la larghezza

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    //metodo per calcollare l'area del
    public double areaRettangolo() {
        return altezza * larghezza;
    }

    //Metodo per calcolare il perimetro
    public double perimetroRettangolo() {
        return 2 * (altezza + larghezza);
    }

    //Metodo per stampare il perimetro e l'area
    public void stampaRettangolo() {
        System.out.println("L'area del rettangolo è: " + areaRettangolo());
        System.out.println("Il perimetro del rettangolo è " + perimetroRettangolo());
    }
    //Metodo per stampare l'area e il perimetro di due rettangoli e la loro somma
    public static void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2){
        System.out.println("Il primo rettangolo: ");
        ret1.stampaRettangolo();
        System.out.println("\nIl secondo rettangolo: ");
        ret2.stampaRettangolo();

        double sommaAreaRet = ret1.areaRettangolo() + ret2.areaRettangolo();
        double sommaPerimetriRet = ret1.perimetroRettangolo() + ret2.perimetroRettangolo();

        System.out.println("Somma delle aree dei due rettangoli: "+ sommaAreaRet);
        System.out.println("Somma delperimetro dei due rettangoli: "+ sommaPerimetriRet);

    }

}

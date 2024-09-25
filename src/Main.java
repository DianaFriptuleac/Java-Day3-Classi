import esercizio_1.Rettangolo;
import esercizio_2.SIM;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------Ex1---------------------");

        Rettangolo rettangolo1 = new Rettangolo(6.5, 4.5);
        Rettangolo rettangolo2 = new Rettangolo(8.5, 5.0);

        //area e perimetro di uno dei due rettangoli
        System.out.println("Rettangolo1: ");
        rettangolo1.stampaRettangolo();

        //Area, perimetro e somma di entrambi i rettangoli
        System.out.println("I dettagli dei due rettangoli: ");
        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);

        System.out.println("-----------------Ex2---------------------");
        SIM newSim = new SIM("388-2511554");

        //Stampo i dettagli della SIM
        newSim.stampaDatiSIM();

        //Chiamate
        newSim.addChiamate("211-28546558",5);
        newSim.addChiamate("524-65688866", 2);
        newSim.addChiamate("524-52248774",1.5);
        newSim.addChiamate("524-52248774",1.3);
        newSim.addChiamate("211-28546558",5.6);
        newSim.addChiamate("211-28546558",3.5);
        newSim.addChiamate("524-45584257", 8);

        newSim.stampaDatiSIM();

    }
}
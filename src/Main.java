import esercizio_1.Rettangolo;

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
    }
}
import esercizio_1.Rettangolo;
import esercizio_2.SIM;
import esercizio_3.Articolo;
import esercizio_3.Carrello;
import esercizio_3.Cliente;

import javax.swing.text.Caret;
import java.sql.SQLSyntaxErrorException;

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


        System.out.println("-----------------Ex3---------------------");

        //Creo clienti
        Cliente cliente1 = new Cliente(125555412, "Mario Rossi", "mariorossii@gmail.com", "01/10/2023");
        Cliente cliente2 = new Cliente(245512555, "Maria Neri", "marianeri@gmail.com", "12/08/2024");

        //Creo un carello per cliente
        Carrello carrello1 = new Carrello(cliente1.getFullName());
        Carrello carrello2 = new Carrello(cliente2.getFullName());

        //Creo articoli
        Articolo articolo1 = new Articolo(125, "Samsung S24+", 950.00);
        Articolo articolo2 = new Articolo(355, "Samsung S24 Ultra", 1050.00);
        Articolo articolo3 = new Articolo(15525, "IPhone", 1250.00);

        //Add articoli nel carello
        carrello1.addArticolo(articolo1);
        carrello1.addArticolo(articolo2);

        carrello2.addArticolo(articolo3);

        //Stampo i dettagli
        System.out.println(cliente1);
        System.out.println(cliente2);

        //Stampo il carello
        carrello1.dettagliCarello();
        carrello2.dettagliCarello();
    }
}
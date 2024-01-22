/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacce;

/**
 *
 * @author studente
 */
public class Interfacce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creo le figure e shapelandia
        Shape p = new Point();
        Line l = new Line();
        Circle c = new Circle();
        Shapelandia shapelandia = new Shapelandia(10);

        // aggiungo le figure a shapelandia

        shapelandia.add(p);
        shapelandia.add(l);
        shapelandia.add(c);

        // mostro le figure all'interno di shapelandia
        shapelandia.displayAll();

        shapelandia.moveAll();
        System.out.println("--------------------------");

        shapelandia.displayAll();

    }

}

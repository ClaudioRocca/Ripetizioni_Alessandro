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
public class Shapelandia {

    private Shape[] shapes;

    /*
     * ESEMPIO:
     * shapes ha lunghezza 10
     * all'inizio è vuoaìto, quindi cont = 0
     * 
     * INSERIAMO UNA NUOVA FIGURA
     * 
     * Inseriamo la figura
     * Aumentiamo cont a 1
     * 
     * 
     * 
     */
    private int cont;

    public Shapelandia(int size) {
        this.shapes = new Shape[size];
        this.cont = 0;
    }

    public void add(Shape s) {

        if (cont < shapes.length) {
            // inseriamo la nuova figura
            shapes[cont] = s;

            cont++;
        }

        else {
            System.out.println("non c'è più spazio");
        }

    }

    public void displayAll() {
        for (int i = 0; i < cont; i++) {

            shapes[i].display();

        }
    }

    public void moveAll() {
        for (int i = 0; i < cont; i++) {

            shapes[i].move();

        }

    }

}

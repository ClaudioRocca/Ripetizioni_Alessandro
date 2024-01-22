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
public class Point extends Shape {

    public Point() {
        super(0, new MoveRandomSpeed());
    }

    @Override
    public void display() {
        System.out.println("La figura è di tipo " + this.getClass() + " e parte da una posizione " + posX);
    }

    public void move() {
        this.setPosX(this.getMovable().move(this.getPosX()));
    }
}

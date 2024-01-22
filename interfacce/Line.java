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
public class Line extends Shape {

    public Line() {
        super(0, new MoveNoWay());
    }

    @Override
    public void display() {
        System.out.println("La figura è di tipo " + this.getClass() + " e si trova nella posizione " + posX);
    }

    public void move() {
        this.setPosX(this.getMovable().move(this.getPosX()));
    }

}

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
public abstract class Shape {
    protected int posX;
    protected MovableBehaviour m;

    public Shape(int posX, MovableBehaviour m) {
        this.posX = posX;
        this.m = m;
    }

    public int getPosX() {
        return this.posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public MovableBehaviour getMovable() {
        return this.m;
    }

    public abstract void display();

    public abstract void move();
}

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
public class MoveJustOne implements MovableBehaviour {

    @Override
    public int move(int x) {
        return x + 1;
    }

}

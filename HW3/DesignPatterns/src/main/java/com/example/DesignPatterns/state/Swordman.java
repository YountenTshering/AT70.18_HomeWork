package com.example.DesignPatterns.state;

public class Swordman implements State {

    int agi = 7;
    int atk = 13;
    int def = 8;

    @Override
    public void increaseAttack(int increment) {
        // TODO Auto-generated method stub
        atk = atk + increment;
        def = def - (int) 0.3 * increment;

    }

    @Override
    public void increaseDefense(int increment) {
        // TODO Auto-generated method stub
        def = def + increment;

    }

    @Override
    public void printStates() {
        // TODO Auto-generated method stub
        System.out.println("Agility - attack - defense : " + agi + " - " + atk + " - " + def);

    }

    @Override
    public void speedUp(int increment) {
        // TODO Auto-generated method stub
        atk = atk + 2 * increment;
        agi = agi + increment;

    }

}

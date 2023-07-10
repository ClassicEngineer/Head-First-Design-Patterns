package ru.daniladeveloper.patterns.strategy;

public class Warrior {

    private AttackBehavior attackBehavior;

    private DefenseBehaviour defenseBehaviour;


    public void attack(AttackBehavior behavior) {
        behavior.attack();
    }

    public void defense (DefenseBehaviour behaviour) {
        behaviour.defense();
    }
}

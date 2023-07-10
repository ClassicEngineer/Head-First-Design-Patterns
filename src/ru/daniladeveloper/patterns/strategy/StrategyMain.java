package ru.daniladeveloper.patterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.attack(new AttackWithBow());

        warrior.attack(new AttackWithSword());
    }
}

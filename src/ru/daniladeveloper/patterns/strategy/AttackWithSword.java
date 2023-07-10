package ru.daniladeveloper.patterns.strategy;

public class AttackWithSword implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with SWORD!");
    }
}

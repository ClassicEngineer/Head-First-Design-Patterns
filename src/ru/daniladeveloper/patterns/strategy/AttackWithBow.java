package ru.daniladeveloper.patterns.strategy;

public class AttackWithBow implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("Attack with BOW!");
    }
}

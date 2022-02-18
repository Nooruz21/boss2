package com.company;

public class Warrior extends Hero implements HavingSuperAbility{
    @Override
    public void superAbilityType() {
        super.superAbilityType();
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}

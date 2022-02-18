package com.company;

public class Medic extends Hero implements HavingSuperAbility {
    @Override
    public void superAbilityType() {
        super.superAbilityType();
        System.out.println("Medic применил суперспособность Лечение");
    }
}

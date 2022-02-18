package com.company;

public class Magic extends Hero  implements HavingSuperAbility {
    @Override
    public void superAbilityType() {
        super.superAbilityType();
        System.out.println(" Magic применил суперспособность Fair boll");
    }
}

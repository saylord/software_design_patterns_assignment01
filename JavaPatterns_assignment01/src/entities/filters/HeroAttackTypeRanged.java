package entities.filters;

import entities.interfaces.IHeroAttackType;

public class HeroAttackTypeRanged implements IHeroAttackType {
    @Override
    public void attackType() {
        System.out.println("This hero has ranged attack type.");
    }
}

package entities.filters;

import entities.interfaces.IHeroAttackType;

public class HeroAttackTypeMelee implements IHeroAttackType {
    @Override
    public void attackType() {
        System.out.println("This hero has melee attack type.");
    }
}

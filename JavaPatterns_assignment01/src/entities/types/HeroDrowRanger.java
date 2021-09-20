package entities.types;

import entities.bases.Hero;
import entities.filters.HeroAttackTypeRanged;
import entities.filters.HeroAttributeAgility;
import entities.filters.HeroComplexityLow;
import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public class HeroDrowRanger extends Hero {

    public HeroDrowRanger() {
        super(new HeroAttributeAgility(), new HeroComplexityLow(), new HeroAttackTypeRanged());
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Drow Ranger.");
    }

    @Override
    public void response() {
        System.out.println("Drow Ranger's response: 'I go in silence.'");
    }
}

package entities.types;

import entities.bases.Hero;
import entities.filters.HeroAttackTypeRanged;
import entities.filters.HeroAttributeAgility;
import entities.filters.HeroComplexityMedium;
import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public class HeroTrollWarlord extends Hero {

    public HeroTrollWarlord() {
        super(new HeroAttributeAgility(), new HeroComplexityMedium(), new HeroAttackTypeRanged());
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Troll Warlord.");
    }

    @Override
    public void response() {
        System.out.println("Troll Warlord's response: 'I live to fight.'");
    }
}

package entities.types;

import entities.bases.Hero;
import entities.filters.HeroAttackTypeRanged;
import entities.filters.HeroAttributeAgility;
import entities.filters.HeroComplexityMedium;
import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public class HeroTemplarAssassin extends Hero {
    public HeroTemplarAssassin() {
        super(new HeroAttributeAgility(), new HeroComplexityMedium(), new HeroAttackTypeRanged());
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Templar Assassin.");
    }

    @Override
    public void response() {
        System.out.println("Templar Assassin's response: 'The mysteries cannot protect themselves'");
    }
}

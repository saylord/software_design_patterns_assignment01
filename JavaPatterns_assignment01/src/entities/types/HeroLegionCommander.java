package entities.types;

import entities.bases.Hero;
import entities.filters.HeroAttackTypeMelee;
import entities.filters.HeroAttributeStrength;
import entities.filters.HeroComplexityMedium;
import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public class HeroLegionCommander extends Hero {
    public HeroLegionCommander() {
        super(new HeroAttributeStrength(), new HeroComplexityMedium(), new HeroAttackTypeMelee());
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Legion Commander.");
    }

    @Override
    public void response() {
        System.out.println("Legion Commander's response: 'Fight for your honor!'");
    }
}

package entities.types;

import entities.bases.Hero;
import entities.filters.HeroAttackTypeRanged;
import entities.filters.HeroAttributeIntelligence;
import entities.filters.HeroComplexityHigh;
import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public class HeroInvoker extends Hero {

    public HeroInvoker() {
        super(new HeroAttributeIntelligence(), new HeroComplexityHigh(), new HeroAttackTypeRanged());
    }

    @Override
    public void display() {
        System.out.println("Picked hero: Invoker.");
    }

    @Override
    public void response() {
        System.out.println("Invoker's response: 'Knowledge is power!'");
    }

}

package entities.filters;

import entities.interfaces.IHeroAttributeBehaviour;

public class HeroAttributeIntelligence implements IHeroAttributeBehaviour {

    @Override
    public void attribute() {
        System.out.println("Hero's main attribute is intelligence.");
    }
}

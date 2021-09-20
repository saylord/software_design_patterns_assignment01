package entities.filters;

import entities.interfaces.IHeroAttributeBehaviour;

public class HeroAttributeAgility implements IHeroAttributeBehaviour {

    @Override
    public void attribute() {
        System.out.println("Hero's main attribute is agility.");
    }
}

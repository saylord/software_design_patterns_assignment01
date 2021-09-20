package entities.filters;

import entities.interfaces.IHeroComplexityBehaviour;

public class HeroComplexityHigh implements IHeroComplexityBehaviour {
    @Override
    public void complexity() {
        System.out.println("Hero's level of complexity: High.");
    }
}

package entities.bases;

import entities.interfaces.IHeroAttackType;
import entities.interfaces.IHeroAttributeBehaviour;
import entities.interfaces.IHeroComplexityBehaviour;

public abstract class Hero {

    private entities.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour;
    private entities.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour;
    private entities.interfaces.IHeroAttackType IHeroAttackType;

    public Hero(entities.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour, entities.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour, entities.interfaces.IHeroAttackType IHeroAttackType) {
        this.IHeroAttributeBehaviour = IHeroAttributeBehaviour;
        this.IHeroComplexityBehaviour = IHeroComplexityBehaviour;
        this.IHeroAttackType = IHeroAttackType;
    }

    public void performAttribute() {
        this.IHeroAttributeBehaviour.attribute();
    }

    public void performComplexity() {
        this.IHeroComplexityBehaviour.complexity();
    }

    public void performAttackType() {
        this.IHeroAttackType.attackType();
    }

    public abstract void display();

    public abstract void response();

    public entities.interfaces.IHeroAttributeBehaviour getIHeroAttributeBehaviour() {
        return IHeroAttributeBehaviour;
    }

    public void setIHeroAttributeBehaviour(entities.interfaces.IHeroAttributeBehaviour IHeroAttributeBehaviour) {
        this.IHeroAttributeBehaviour = IHeroAttributeBehaviour;
    }

    public entities.interfaces.IHeroComplexityBehaviour getIHeroComplexityBehaviour() {
        return IHeroComplexityBehaviour;
    }

    public void setIHeroComplexityBehaviour(entities.interfaces.IHeroComplexityBehaviour IHeroComplexityBehaviour) {
        this.IHeroComplexityBehaviour = IHeroComplexityBehaviour;
    }

    public entities.interfaces.IHeroAttackType getIHeroAttackType() {
        return IHeroAttackType;
    }

    public void setIHeroAttackType(entities.interfaces.IHeroAttackType IHeroAttackType) {
        this.IHeroAttackType = IHeroAttackType;
    }
}

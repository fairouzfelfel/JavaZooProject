package edu.esprit.entities;

import edu.esprit.interfaces.Omnivore;
import edu.esprit.entities.enums.FOOD;
public final class Terrestrial extends Animal implements Omnivore<FOOD> {
   private int nbrLegs ;
     public Terrestrial() {
     }
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatMeat(FOOD meat) {
        System.out.println("The Terrestrial " + getName() + " is eating " + meat);
    }

    @Override
    public void eatPlant(FOOD Plant) {
        System.out.println("The Terrestrial " + getName() + " is eating " + Plant);
    }

    @Override
    public void eatPlantandMeat(FOOD FOOD) {
        System.out.println("The Terrestrial " + getName() + " is eating " + FOOD + " plants and meat");
    }

}

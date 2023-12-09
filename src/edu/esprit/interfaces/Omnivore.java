package edu.esprit.interfaces;

public interface Omnivore <T> extends Herbivore<T> , Carnivore<T> {
void eatPlantandMeat(T FOOD);
}

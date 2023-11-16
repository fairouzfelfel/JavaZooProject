package edu.esprit.entities;
import edu.esprit.test.ZooManagement;

import java.util.Arrays;
public  class Zoo extends ZooManagement {
    Animal[] animals;
    String name;
    String city;
    int nbrCages=5;
    static int nbrAnimaux = 0;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", nombre de Cages " + nbrCages);
    }
    boolean addAnimal(Animal animal) {
        System.out.println(animal);
        if (searchAnimal(animal) != -1)
            return false;
        if (nbrAnimaux == nbrCages)
            return false;
        animals[nbrAnimaux] = animal;
        nbrAnimaux++;
        return true;
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }
    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimaux; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux] = null;
        this.nbrAnimaux--;
        return true;
    }
    void displayAnimals() {
        System.out.println("Liste des animaux de " + name + ":");
        for (int i = 0; i < nbrAnimaux; i++) {
            System.out.println(animals[i]);
        }

    }
    public String getName() {
        return name;
    }
    boolean isZooFull() {
        return nbrAnimaux >= nbrCages;}

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else if (z2.nbrAnimaux > z1.nbrAnimaux) {
            return z2;
        } else {

            return z1;
        }}

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}


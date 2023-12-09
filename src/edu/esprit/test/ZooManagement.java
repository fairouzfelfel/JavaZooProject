package edu.esprit.test;
import edu.esprit.entities.enums.FOOD;
import edu.esprit.Exceptions.InvalidAgeException;
import edu.esprit.Exceptions.ZooFullExceptions;
import edu.esprit.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        try {
            lion.setAge(8);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullExceptions e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimaux() + " animaux");
        }
        try {
            myZoo.addAnimal(dog);
        } catch (ZooFullExceptions e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimaux() + " animaux");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullExceptions e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimaux() + " animaux");
        }

        myZoo.displayAnimals();

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(24.5f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(21.8f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.3f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(22.6f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(24.6f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(29.6f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(219.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(2.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new Penguin());

        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

        myZoo.displayNumberOfAquaticsByType();

        System.out.println(myZoo.maxPenguinSwimmingDepth());


        System.out.println("----------------Prosit 8-----------------");

        Penguin penguin = new Penguin("Wild animals", "Pingu", 3, true, "Ocean", 25.6f);
        penguin.eatMeat(FOOD.MEAT);
        Dolphin dolphin = new Dolphin("Delphinoidea", "Willy", 5, true, "Ocean", 34.2f);
        dolphin.eatMeat(FOOD.MEAT);
        Terrestrial terrestrial = new Terrestrial("Bears", "Winnie", 6, true, 4);
        terrestrial.eatPlantandMeat(FOOD.BOTH);
        Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 2, true, 4);
        terrestrial2.eatPlant(FOOD.PLANT);

    }}

//
//        System.out.println(myZoo.addAnimal(lion));
//        System.out.println(myZoo.addAnimal(dog));
//
//        myZoo.displayAnimals();
//
//        System.out.println(myZoo.searchAnimal(dog));
//        Animal dog2 = new Animal("Canine", "lll", 2, true);
//        System.out.println(myZoo.searchAnimal(dog2));
//
////           System.out.println(myZoo.removeAnimal(dog));
//        myZoo.displayAnimals();
//
//
//        System.out.println(myZoo);
//
//        myZoo.addAnimal(lion);
//        myZoo.addAnimal(dog);
//        myZoo.addAnimal(dog2);
//        myZoo.displayAnimals();

package edu.esprit.test;

import edu.esprit.entities.Animal;
import edu.esprit.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, true);
        Animal crocodile = new Animal("Reptile", "Crocodile", 8, false);
        Zoo myZoo = new Zoo("belvédère", "Nabeul");

        System.out.println(myZoo.addAnimal(lion));
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(crocodile);
        myZoo.displayAnimals();
        // Supprimer un animal du zoo
        myZoo.removeAnimal(elephant);
        // Afficher à nouveau la liste des animaux après la suppression
        myZoo.displayAnimals();
        System.out.println(myZoo);
        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Zoo2", "Tunis");
        anotherZoo.addAnimal(new Animal("Oiseau", "Aigle", 3, false));
        // Afficher des informations sur le zoo
        anotherZoo.displayZoo();
        // Afficher la liste des animaux dans le zoo
        anotherZoo.displayAnimals();
    }

}

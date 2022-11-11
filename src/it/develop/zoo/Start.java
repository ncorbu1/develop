package it.develop.zoo;

public class Start {

    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("We are creating the zoo");
        System.out.println("---------------------");


Animal giraffe, lion;
lion = new Animal("Giacomo");
        giraffe = new Animal("Anna", "giraffa");
lion = new Animal(true);
lion.name = "Giacomo";
giraffe.hasFur = true;
lion.type = "leone";

        System.out.println("------");

ZooKeeper marco = new ZooKeeper("Marco");
    marco.feedAnimal(giraffe);

    Food meat = new Food("T-Bone",500);
        Food fish = new Food("Merluzzo",200);
        System.out.println("------ Feeding");
       int giraffeCalories = marco.feedAnimal(giraffe, meat);
       int lionCalories = marco.feedAnimal(lion, fish);
 int totalCalories = giraffeCalories + lionCalories;
        System.out.println("------");
 System.out.println("------ All animals are fed with " + totalCalories + " kcal");

    }

    }


package it.develop.zoo;

public class ZooKeeper {

    public String name;


    public ZooKeeper (String name){
    this.name = name;}

    public void feedAnimal(Animal animal){
        System.out.println(name + " is feeding " + animal.name);}

    public int feedAnimal(Animal animal, Food food){
        System.out.println(name + " is feeding " + animal.name + " with " + food.name + " that is " + food.kcal + "kcal");
return food.kcal;



    }


}

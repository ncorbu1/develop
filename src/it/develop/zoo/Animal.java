package it.develop.zoo;

public class Animal {

    // animal characteristics//
    public String name;
    public String type;
    public Boolean hasFur;

    public Animal() {
        System.out.println("A new animal is born");
    }

        public Animal(String name) {
            System.out.println("A new animal is born, his name is " + name);
    this.name = name;
    }

           public Animal(String name, String type) {
                System.out.println("A new " + type + " is born, his name is " + name);
    this.name = name;
    this.type = type;
    }
             public Animal(Boolean hasFur) {
                System.out.println("A new animal is born, has fur? " + hasFur);
    this.hasFur = hasFur;
    }



}

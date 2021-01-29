package Polymorphic_Class;

public class Main {
    public static void main(String[] args) {
        Animal animalAnimal = new Animal();
        Animal animalCat = new Cat();
        Animal animalDog = new Dog();

        makeAnimalMove(animalAnimal);
        makeAnimalMove(animalCat);
        makeAnimalMove(animalDog);
    }
    public static void makeAnimalMove(Animal animal){
        animal.move();
    }
}
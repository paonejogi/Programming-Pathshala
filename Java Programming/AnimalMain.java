class Animal {
    //Polymorphism!
    public void animalSound(){
        System.out.println("This is default sound an animal makes!  heheheee!");
    }
}

class Dog extends Animal{
    
    public void animalSound(){
       System.out.println("Bow Bowwww !");
    }
}

class Cat extends Animal{
    public  void animalSound(){
        System.out.println("Meow meow !");
    }
}
 
class AnimalMain{
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
    }
}

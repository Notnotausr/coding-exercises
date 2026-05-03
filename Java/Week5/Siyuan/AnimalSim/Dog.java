public class Dog extends Mammal{
    public Dog(String breed) {
        super(true);
        System.out.println("I am a " + breed);
    }

    public static void main(String[] args){
        Dog myDog = new Dog("corgi");
        myDog.walk(500.00);
        myDog.eat("DogFood");
    }
}
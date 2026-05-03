public class Dog extends Mammal{
    /* needs breed field here as well */

    public Dog(String breed) {
        super(true);
        System.out.println("I am a " + breed);
    }

    /* needs a bark() method here */

    public static void main(String[] args){
        Dog myDog = new Dog("corgi");
        myDog.walk(500.00);
        myDog.eat("DogFood");
        /* also need to call bark() here */
    }
}
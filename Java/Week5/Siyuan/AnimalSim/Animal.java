/* seems incomplete right now, will give more time */

public class Animal {
    String animalType;

    public Animal(String type){
        animalType = type;
        System.out.println("I am a " + animalType);
    }

    public void eat(String food){
        System.out.println("I am eating " + food + ".");
    }
}


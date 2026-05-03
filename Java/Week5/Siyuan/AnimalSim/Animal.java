public class Animal {
    String animalType; /* alr i suppose, it is supposed to be "type" however */

    public Animal(String type){
        animalType = type;
        System.out.println("I am a " + animalType);
    }

    public void eat(String food){
        System.out.println("I am eating " + food + ".");
    }
}
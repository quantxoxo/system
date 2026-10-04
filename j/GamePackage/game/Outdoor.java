package game;

public class Outdoor {

    public Outdoor() {
        System.out.println("Outdoor Default Constructor");
    }

    public Outdoor(String game) {
        System.out.println("Outdoor Game: " + game);
    }

    public void display() {
        System.out.println(
            "Outdoor Players: Cricket, Football, Hockey"
        );
    }
}

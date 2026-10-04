package game;

public class Indoor {

    public Indoor() {
        System.out.println("Indoor Default Constructor");
    }

    public Indoor(String game) {
        System.out.println("Indoor Game: " + game);
    }

    public void display() {
        System.out.println(
            "Indoor Players: Chess, Carrom, Table Tennis"
        );
    }
}

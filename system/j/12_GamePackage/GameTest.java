import game.*;

class GameTest {
    public static void main(String[] args) {

        Indoor i = new Indoor("Chess");
        Outdoor o = new Outdoor("Cricket");

        i.display();
        o.display();
    }
}

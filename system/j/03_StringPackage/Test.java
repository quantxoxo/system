import stringoperation.*;

class Test {
    public static void main(String[] args) {
        String a = "Hello ";
        String b = "World";

        Con c = new Con();
        Comp p = new Comp();

        c.concatenate(a, b);
        p.compare(a, b);
    }
}

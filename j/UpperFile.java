import java.io.FileReader;

class UpperFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");

        int ch;

        while ((ch = fr.read()) != -1) {
            System.out.print(
                Character.toUpperCase((char) ch)
            );
        }

        fr.close();
    }
}

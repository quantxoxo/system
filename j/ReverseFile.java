import java.io.FileReader;
import java.util.Scanner;

class ReverseFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        FileReader fr = new FileReader(fileName);

        String data = "";
        int ch;

        while ((ch = fr.read()) != -1) {
            data = data + (char) ch;
        }

        fr.close();

        System.out.println("Reverse contents:");

        for (int i = data.length() - 1; i >= 0; i--) {
            char c = data.charAt(i);

            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }

            System.out.print(c);
        }
    }
}

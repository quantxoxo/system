import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

class FileCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        BufferedReader br =
            new BufferedReader(new FileReader(fileName));

        int characters = 0;
        int words = 0;
        int lines = 0;

        String line;

        while ((line = br.readLine()) != null) {

            lines++;

            characters = characters + line.length();

            if (!line.trim().equals("")) {
                String[] arr = line.trim().split("\\s+");
                words = words + arr.length;
            }
        }

        br.close();

        System.out.println("Characters = " + characters);
        System.out.println("Words = " + words);
        System.out.println("Lines = " + lines);
    }
}

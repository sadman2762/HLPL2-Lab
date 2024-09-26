package Practice12Oct;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rollercoaster[] rollercoasters = new Rollercoaster[20];
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine(); // consume new line character

        for (int i = 0; i < length; i++) {
            String line = input.nextLine();
            String[] token = line.split(";");

            Rollercoaster rollercoaster = new Rollercoaster(
                    token[0], token[1], Integer.parseInt(token[2]), Integer.parseInt(token[3])
            );

            rollercoasters[i] = rollercoaster;

        }

        Arrays.sort(rollercoasters, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(rollercoasters[i]);
        }

    }
}

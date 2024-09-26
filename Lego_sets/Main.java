package Lego_sets;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine(); // To consume the new line character

        Lego_Set[] lego_sets = new Lego_Set[20];
        for (int i = 0; i < length; i++) {
            String line = input.nextLine();
            String[] tokens = line.split(";");
            Lego_Set lego_set = new Lego_Set(
                    tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])
            );

            lego_sets[i] = lego_set;
        }

        Arrays.sort(lego_sets, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(lego_sets[i]);
        }

        input.close();
    }
}

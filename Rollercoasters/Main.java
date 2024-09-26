package Rollercoasters;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rollercoaster[] rollercoasters = new Rollercoaster[20];

        int length = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] tokens = line.split(";");
            Rollercoaster rollercoaster = new Rollercoaster(
                    tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])
            );
            rollercoasters[length] = rollercoaster;
            length++;
        }

        Arrays.sort(rollercoasters, 0, length);
        for (int i = 0; i < length; i++) {
            System.out.println(rollercoasters[i]);
        }
    }
}

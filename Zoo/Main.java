package Zoo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Animal[] animals = new Animal[20];
        int length = 0;

        while(input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("END")) {
                break;
            }

            String[] tokens = line.split(";");

            if(tokens.length == 3 && !tokens[1].isEmpty()) { // Not a good condition which will return null
                Animal animal = new Animal(
                        tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2])
                );

                animals[length] = animal;
            }

            else if(tokens.length == 4 && !tokens[1].isEmpty()) {
                 Mammal mammal = new Mammal(
                        tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                        Integer.parseInt(tokens[3])
                );

                 animals[length] = mammal;
            }
            length++;

        }

        Arrays.sort(animals, 1, length);

        for (int i = 0; i < length; i++) {
            System.out.println(animals[i]);
        }
    }
}

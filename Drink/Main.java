package Drink;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Drink[] drinks = new Drink[20];
        int length = 0;

        while(input.hasNextLine())
        {
            String line = input.nextLine();
            String[] tokens = line.split(";");

            if (tokens.length == 3) {
                Drink drink = new Drink(
                        tokens[0], tokens[1], Integer.parseInt(tokens[2])
                );
                drinks[length] = drink;
            }
            else if (tokens.length == 4) {
                Alcoholic_drink alcoholic_drink = new Alcoholic_drink(
                        tokens[0], tokens[1], Integer.parseInt(tokens[2]), tokens[3]
                );
                drinks[length] = alcoholic_drink;
                // Store the Alcoholic_drink object in the 'drinks' make sorting easier avoiding Null value
            }

            length++;
        }

        Arrays.sort(drinks, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(drinks[i]);
        }

    }
}

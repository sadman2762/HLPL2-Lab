package Drink_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[20];
        Scanner input = new Scanner(System.in);

        int length = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] token = line.split(";");

            if(token.length == 4){
                Alcoholic_drink alcoholicDrink = new Alcoholic_drink(
                        token[0], token[1], Integer.parseInt(token[2]), Double.parseDouble(token[3])
                );

                drinks[length] = alcoholicDrink;
            } else if (token.length == 3) {
                Drink drink = new Drink(
                        token[0], token[1], Integer.parseInt(token[2])
                );

                drinks[length] = drink;
            }

            length++;
        }

        Arrays.sort(drinks, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(drinks[i]);
        }
    }
}

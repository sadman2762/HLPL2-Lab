package Drink_Practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[20];
        Scanner input = new Scanner(System.in);

        int length = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            if (line.equals("END")){
                break;
            }
            String[] token = line.split(";");

            if(token.length == 3){
                Drink drink = new Drink(
                        token[0], token[1], Integer.parseInt(token[2])
                );

                drinks[length] = drink;
            }
            else if(token.length == 4){
                Alcoholic_drink alcoholicDrink = new Alcoholic_drink(
                        token[0], token[1], Integer.parseInt(token[2]), Double.parseDouble(token[3])
                );

                drinks[length] = alcoholicDrink;
            }

            length++;
        }

        for (int i = 0; i < length; i++) {
            System.out.println(drinks[i]);
        }
    }
}

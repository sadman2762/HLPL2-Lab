package Zoo_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[20];
        Scanner input = new Scanner(System.in);

        int length = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            String[] token = line.split(";");
            if(token.length == 4) {
                Mammal mammal = new Mammal(
                        token[0], Double.parseDouble(token[1]), Double.parseDouble(token[2]),
                        Integer.parseInt(token[3])
                );

                animals[length] = mammal;
            }
            else if(token.length == 3){
                Animal animal = new Animal(
                        token[0], Double.parseDouble(token[1]), Double.parseDouble(token[2])
                );

                animals[length] = animal;
            }

            length++;
        }

        Arrays.sort(animals, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(animals[i]);
        }
    }
}

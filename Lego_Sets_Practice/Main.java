package Lego_Sets_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lego_Sets[] lego_sets = new Lego_Sets[20];
        Scanner input = new Scanner(System.in);

        int length = 0;

        while(input.hasNextLine()){
            String line = input.nextLine();
            if(line.equals("END")) {
                break;
            }
            String[] token = line.split(";");

            Lego_Sets lego_set = new Lego_Sets(
                    token[0], token[1], token[2], Integer.parseInt(token[3])
            );

           lego_sets[length] = lego_set;
           length += 1;

        }

        Arrays.sort(lego_sets, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(lego_sets[i]);
        }
    }
}

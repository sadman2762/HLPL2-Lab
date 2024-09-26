package Airport_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Airport[] airports = new Airport[20];
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        input.nextLine(); // To Consume new line character 


        for(int i = 0; i<length; i++){
            String line = input.nextLine();
            String[] token = line.split(";");
            Airport airport = new Airport(
                    token[0], token[1], Integer.parseInt(token[2]), Integer.parseInt(token[3])
            );
            airports[i] = airport;
        }

        Arrays.sort(airports, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(airports[i]);
        }
    }
}

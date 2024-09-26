package Airport;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Airport[] airports = new Airport[20];

        int length = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            if (Objects.equals(line, "END"))
            {
                break;
            }

            String[] tokens = line.split(";");
            Airport airport = new Airport(
                    tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])
            );
            airports[length] = airport;
            length++;
        }

        Arrays.sort(airports, 0, length);
        for(int i=0; i<length; i++)
        {
            System.out.println(airports[i]);
        }
    }
}

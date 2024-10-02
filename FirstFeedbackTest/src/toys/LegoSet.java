package toys;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class LegoSet implements Comparable<LegoSet>{
    private String code;
    private String name;
    private final String theme;
    private final int pieces;

    public LegoSet(String theme, int pieces, String code, String name) {
        this.theme = theme;
        this.pieces = pieces;
        this.code = code;
        this.name = name;
    }

    public LegoSet(int pieces, String name, String code) {
        this.pieces = pieces;
        this.name = name;
        this.code = code;
        theme = "Lego City";
    }

    public LegoSet(String line) {
        String[] tokens = line.split(";");
        code = tokens[0];
        name = tokens[1];
        theme = tokens[2];
        pieces = Integer.parseInt(tokens[3]);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getTheme() {
        return theme;
    }

    public int getPieces() {
        return pieces;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + code + "): " + pieces + "-" + theme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LegoSet legoSet = (LegoSet) o;
        return Objects.equals(code, legoSet.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }


    @Override
    public int compareTo(LegoSet o) {
        if(this.pieces != o.pieces){
            return -(this.pieces - o.pieces);
        }
        if(!Objects.equals(this.theme,o.theme)){
            return this.theme.compareTo(o.theme);
        }
        if(this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        }
        return this.code.compareTo(o.code);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LegoSet[] legoSets = new LegoSet[20];
        int length = 0;

        while(true){
            String line = sc.nextLine();
            if(Objects.equals(line,"END")){
                break;
            }
            legoSets[length] = new LegoSet(line);
            length++;

        }
        Arrays.sort(legoSets,0,length);
        for (int i = 0; i < length; i++) {
            System.out.println(legoSets[i]);
        }
    }
}

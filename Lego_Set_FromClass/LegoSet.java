package Lego_Set_FromClass;

import java.util.*;

public class LegoSet implements Comparable<LegoSet>{
    private final String code;
    private final String name;
    private final String theme;
    private final int bricks;

    //Own defined Constructor

    public LegoSet(String line){
        String[] tokens = line.split(";");
        code = tokens[0];
        name = tokens[1];
        theme = tokens[2];
        bricks = Integer.parseInt(tokens[3]);
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

    public int getBricks() {
        return bricks;
    }

    @Override
    public String toString() {
        return "LegoSet{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", bricks=" + bricks +
                '}';
    }

    @Override
    public int compareTo(LegoSet o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<LegoSet> legoSets = new ArrayList<>();

        while(input.hasNextLine()) {
            LegoSet legoSet = new LegoSet(input.nextLine());
            legoSets.add(legoSet);
        }

        //Arrays.sort(legoSets, 0, legoSets.size());

        for (int i = 0; i < legoSets.size(); i++) {
            System.out.println(legoSets.get(i));
        }

        System.out.println("====================");

        Collections.sort(legoSets, new LegoSetComparator());

        for(LegoSet legoSet : legoSets){
            System.out.println(legoSet);
        }
    }
}

class LegoSetComparator implements Comparator<LegoSet> {

    @Override
    public int compare(LegoSet o1, LegoSet o2) {
        if (o1.getBricks() != o2.getBricks()){
            return o2.getBricks() - o1.getBricks();
        }

        if(!o1.getTheme().equals(o2.getTheme())) {
            return o1.getTheme().compareTo(o2.getTheme());
        }

        if(!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }

        return o1.getCode().compareTo(o2.getCode());
    }
}

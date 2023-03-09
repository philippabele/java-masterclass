package section12generics.challengegenerics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTeam(T team) {
        league.add(team);
    }

    public void printLeague() {
        Collections.sort(league);
        for (T team : league) {
            System.out.println(team.getName());
        }
    }

}

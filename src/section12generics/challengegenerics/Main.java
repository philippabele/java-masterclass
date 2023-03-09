package section12generics.challengegenerics;

public class Main {

    public static void main(String[] args) {

        League<Team<SoccerPlayer>> league = new League<>("Bundeslige");

        Team<SoccerPlayer> fc_bayern = new Team<>("FCB");
        Team<SoccerPlayer> vfb_stuttgart = new Team<>("VFB");
        Team<SoccerPlayer> hoffenheim = new Team<>("1899");

        league.addTeam(fc_bayern);
        league.addTeam(vfb_stuttgart);
        league.addTeam(hoffenheim);

        fc_bayern.matchResult(hoffenheim, 5, 1);
        vfb_stuttgart.matchResult(fc_bayern, 2, 1);
        hoffenheim.matchResult(vfb_stuttgart, 0, 0);

        league.printLeague();

    }

}

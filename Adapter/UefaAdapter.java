package Adapter;
import leagues.UefaLeague;

// Adapter for UEFA
public class UefaAdapter implements FootballMatch {
    private final UefaLeague uefa;

    public UefaAdapter(UefaLeague uefa) {
        this.uefa = uefa;
    }

    @Override
    public void showMatch(String homeTeam, String awayTeam) {
        uefa.displayGame(homeTeam, awayTeam);
    }
}
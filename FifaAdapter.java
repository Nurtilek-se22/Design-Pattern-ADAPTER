// Adapter for FIFA
public class FifaAdapter implements FootballMatch {
    private final FifaLeague fifa;

    public FifaAdapter(FifaLeague fifa) {
        this.fifa = fifa;
    }

    @Override
    public void showMatch(String homeTeam, String awayTeam) {
        fifa.presentMatch(homeTeam, awayTeam);
    }
}
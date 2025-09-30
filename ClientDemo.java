// Client
public class ClientDemo {
    public static void main(String[] args) {
        FootballMatch uefaMatch = new UefaAdapter(new UefaLeague());
        FootballMatch fifaMatch = new FifaAdapter(new FifaLeague());

        uefaMatch.showMatch("Real Madrid", "Bayern Munich");
        fifaMatch.showMatch("Argentina", "Brazil");
    }
}
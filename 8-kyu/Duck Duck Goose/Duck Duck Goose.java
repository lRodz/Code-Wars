public class Kata {

    public static String duckDuckGoose(Player[] players, int goose) {

        return players[(goose - 1) % players.length].name;

    }
}